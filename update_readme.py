#!/usr/bin/env python3
"""
CodeTree README Auto-Update Script
Automatically updates the main README.md based on the date directories
"""

import os
import re
from datetime import datetime
from pathlib import Path


def get_date_dirs(base_path):
    """Get all directories that match the date pattern (YYMMDD)"""
    dirs = []
    for item in os.listdir(base_path):
        if os.path.isdir(os.path.join(base_path, item)) and re.match(r'^\d{6}$', item):
            dirs.append(item)
    return sorted(dirs)


def count_problems_in_dir(dir_path):
    """Count the number of problem directories (excluding README.md)"""
    items = os.listdir(dir_path)
    # Count only directories, excluding README.md and hidden files
    problems = [item for item in items 
                if item != 'README.md' 
                and not item.startswith('.')
                and os.path.isdir(os.path.join(dir_path, item))]
    return len(problems)


def parse_daily_readme(readme_path):
    """Parse daily README.md to extract problem count and XP info"""
    try:
        with open(readme_path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        # Extract total problems
        problem_match = re.search(r'\|\s*총 문제 수\s*\|\s*(\d+)\s*\|', content)
        problems = int(problem_match.group(1)) if problem_match else 0
        
        # Extract XP
        xp_match = re.search(r'\|\s*획득 경험치\s*\|\s*(\d+)\s*/\s*\d+\s*XP\s*\|', content)
        xp = int(xp_match.group(1)) if xp_match else 0
        
        return problems, xp
    except Exception as e:
        print(f"Warning: Could not parse {readme_path}: {e}")
        return 0, 0


def format_date(date_str):
    """Format YYMMDD to YYYY-MM-DD"""
    year = "20" + date_str[:2]
    month = date_str[2:4]
    day = date_str[4:6]
    return f"{year}-{month}-{day}"


def analyze_repository(base_path):
    """Analyze all date directories and gather statistics"""
    date_dirs = get_date_dirs(base_path)
    
    total_problems = 0
    total_xp = 0
    date_info = []
    
    for date_dir in date_dirs:
        dir_path = os.path.join(base_path, date_dir)
        readme_path = os.path.join(dir_path, 'README.md')
        
        # Count problems in directory
        problem_count = count_problems_in_dir(dir_path)
        
        # If README exists, parse it for more details
        xp = 0
        if os.path.exists(readme_path):
            _, xp = parse_daily_readme(readme_path)
        
        total_problems += problem_count
        total_xp += xp
        
        date_info.append({
            'dir': date_dir,
            'date': format_date(date_dir),
            'problems': problem_count,
            'xp': xp
        })
    
    return {
        'date_dirs': date_dirs,
        'date_info': date_info,
        'total_problems': total_problems,
        'total_xp': total_xp,
        'total_days': len(date_dirs)
    }


def generate_readme(stats):
    """Generate updated README.md content"""
    
    first_date = stats['date_info'][0]['date'] if stats['date_info'] else ''
    last_date = stats['date_info'][-1]['date'] if stats['date_info'] else ''
    
    # Build learning period string
    if first_date and last_date:
        learning_period = f"{first_date} ~ {last_date}"
    else:
        learning_period = "진행 중"
    
    readme_content = f"""# 🌲 CodeTree 학습 저장소

## 📚 프로젝트 소개

이 저장소는 [CodeTree](https://www.codetree.ai/)에서 학습한 알고리즘 문제 풀이를 기록하는 공간입니다.

## 🎯 학습 목표

- 체계적인 알고리즘 학습
- 꾸준한 문제 풀이를 통한 실력 향상
- 문제 해결 능력 및 코딩 역량 강화

## 📊 학습 현황

- **총 문제 수**: {stats['total_problems']}개
- **총 획득 경험치**: {stats['total_xp']} XP
- **사용 언어**: Java
- **학습 기간**: {learning_period}
- **연속 학습일**: {stats['total_days']}일

## 📁 저장소 구조

```
CodeTree/
"""
    
    # Add date directories to structure
    for info in stats['date_info'][:10]:  # Show first 10
        readme_content += f"├── {info['dir']}/    # {info['date']}: {info['problems']}개 문제\n"
    
    if len(stats['date_info']) > 10:
        readme_content += f"└── ... (총 {len(stats['date_info'])}개 날짜)\n"
    
    readme_content += """```

각 날짜별 폴더에는 해당 날짜에 학습한 문제들의 해결 코드가 포함되어 있습니다.

## 🔢 최근 학습 기록

| 날짜 | 문제 수 | 획득 XP |
|------|---------|---------|
"""
    
    # Add recent 10 days
    for info in reversed(stats['date_info'][-10:]):
        readme_content += f"| {info['date']} | {info['problems']}개 | {info['xp']} XP |\n"
    
    readme_content += f"""
## 💡 문제 유형

- 🟢 **Concept**: 기본 개념을 이해하고 간단하게 구현하는 문제
- 🟡 **Challenge**: 응용력을 요구하는 문제
- 🔴 **Test**: 학습한 내용을 종합적으로 평가하는 문제

## 📈 학습 방식

1. **Concept**: 기본 개념 학습 및 간단한 구현
2. **Challenge**: 응용 문제 풀이로 이해도 심화
3. **Test**: 학습 내용 종합 평가로 마스터리 확인

## 🔗 참고 링크

- [CodeTree 공식 사이트](https://www.codetree.ai/)
- [내 프로필](https://www.codetree.ai/profiles/)

## 📝 커밋 규칙

- 문제를 해결할 때마다 자동으로 커밋됩니다
- 커밋 메시지 형식: `Title: [문제명], Time: [실행시간], Memory: [메모리], Status: [상태]`

## 🎓 학습 철학

> "꾸준함이 실력을 만든다"

매일 조금씩이라도 학습하며, 문제 해결 능력을 키워나가고 있습니다.

---

**Last Updated**: {datetime.now().strftime('%Y-%m-%d')}  
**Total Days**: {stats['total_days']}일 연속 학습  
**Total Problems**: {stats['total_problems']}개 문제 해결  
**Total XP**: {stats['total_xp']} XP 획득
"""
    
    return readme_content


def main():
    """Main function"""
    # Get the base directory (where the script is located)
    base_path = os.path.dirname(os.path.abspath(__file__))
    
    print("🌲 CodeTree README Auto-Update Script")
    print("=" * 50)
    
    # Analyze repository
    print("📊 Analyzing repository...")
    stats = analyze_repository(base_path)
    
    print(f"✅ Found {len(stats['date_dirs'])} date directories")
    print(f"✅ Total problems: {stats['total_problems']}")
    print(f"✅ Total XP: {stats['total_xp']}")
    
    # Generate README
    print("📝 Generating README.md...")
    readme_content = generate_readme(stats)
    
    # Write README
    readme_path = os.path.join(base_path, 'README.md')
    with open(readme_path, 'w', encoding='utf-8') as f:
        f.write(readme_content)
    
    print(f"✅ README.md updated successfully!")
    print("=" * 50)


if __name__ == '__main__':
    main()
