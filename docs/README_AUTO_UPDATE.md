# README 자동 업데이트 기능

## 개요

이 저장소는 CodeTree 학습 내용이 추가될 때마다 README.md를 자동으로 업데이트합니다.

## 작동 방식

### 1. 자동 업데이트 스크립트 (`update_readme.py`)

- 모든 날짜 디렉토리 (YYMMDD 형식)를 스캔합니다
- 각 디렉토리의 문제 수와 경험치를 계산합니다
- README.md를 최신 정보로 업데이트합니다

### 2. GitHub Actions 워크플로우 (`.github/workflows/update-readme.yml`)

**트리거 조건:**
- `main` 브랜치에 `260*` 디렉토리 내 파일이 푸시될 때
- 수동 실행 (workflow_dispatch)

**실행 과정:**
1. 저장소 체크아웃
2. Python 환경 설정
3. `update_readme.py` 스크립트 실행
4. README.md가 변경되었는지 확인
5. 변경사항이 있으면 자동으로 커밋 및 푸시

## 수동으로 업데이트하기

```bash
python3 update_readme.py
```

## 스크립트가 수집하는 정보

- 총 문제 수
- 총 획득 경험치
- 학습 기간
- 연속 학습일
- 최근 학습 기록

## 문제 해결

### README가 자동으로 업데이트되지 않는 경우

1. GitHub Actions 탭에서 워크플로우 실행 로그를 확인하세요
2. 수동으로 스크립트를 실행해 보세요: `python3 update_readme.py`
3. 워크플로우를 수동으로 실행해 보세요 (GitHub Actions 탭 → Update README → Run workflow)

### 스크립트 실행 오류

- Python 3.x가 설치되어 있는지 확인하세요
- 날짜 디렉토리가 YYMMDD 형식인지 확인하세요
- 각 날짜 디렉토리에 README.md 파일이 있는지 확인하세요

## 주의사항

- 날짜 디렉토리는 반드시 YYMMDD 형식이어야 합니다 (예: 260217)
- 각 날짜 디렉토리의 README.md는 표준 포맷을 따라야 합니다
- GitHub Actions는 `main` 브랜치에서만 작동합니다
