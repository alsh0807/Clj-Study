# Clojure Study

> `Clojure CLI + VS Code + Calva`

## 시작하기
```git
git clone https://github.com/alsh0807/Python-by-Tough-Cookie.git
```

필수 설치 항목:

- JDK
- Clojure CLI
- VS Code
- Calva: A Clojure & ClojureScript IDE in Visual Studio Code

## 로컬 실행

### 터미널 REPL

```powershell
clj
```

REPL에서 예제를 직접 실행할 수 있습니다.

```clojure
(+ 1 2 3)
```

## VS Code + Calva

1. VS Code에서 저장소 루트를 엽니다.
2. `Ctrl + Shift + P`
3. `Calva: Start a Project REPL and Connect`
4. `deps.edn` 프로젝트를 선택합니다.

Calva에서 식을 평가하면 REPL에서 결과를 확인할 수 있습니다.

예시:

```clojure
(+ 10 20 30)
```
`src/hello.clj` 파일을 열고 `Alt+Enter`로 각 표현식을 실행하면서 테스트할 수 있습니다.

## 프로젝트 구조

```text
.
├── deps.edn            # Clojure CLI 프로젝트 설정
├── README.md           # 프로젝트 안내 문서
└── src/
    └── hello.clj        # 예제 파일
```
