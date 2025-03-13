# AI Model Sample Backend Service 🚀

### 📌 프로젝트 개요
이 프로젝트는 **AI 모델을 REST API를 통해 실행**하고, 그 결과를 반환하는 Java Spring Boot 기반의 백엔드 애플리케이션입니다.  
`Factory Method 패턴`과 `Strategy 패턴`을 활용하여 **AI 모델을 유연하게 확장**할 수 있도록 설계되었습니다.

---

## 🔧 기술 스택
- **Language:** Java 21
- **Framework:** Spring Boot 3.4.3
- **Build Tool:** Gradle
- **Database:** Postgres (테스트용)
- **Testing:** JUnit 5, Mockito, MockMvc

---

## 🛠️ 주요 설계 패턴
### 1️⃣ **팩토리 메서드 패턴 (Factory Method)**
- `AIModelFactory`를 이용하여 특정 AI 모델을 생성합니다.
- `AnomalyDetectModelFactory`, `ObjectDetectModelFactory`를 통해 확장 가능합니다.

### 2️⃣ **전략 패턴 (Strategy Pattern)**
- `AIModel` 인터페이스를 활용하여 `AnomalyDetectModel`, `ObjectDetectModel`의 구현체를 실행합니다.
- 런타임에서 전략을 변경할 수 있습니다.

---

## 📄 라이선스
이 프로젝트는 MIT 라이선스를 따릅니다.