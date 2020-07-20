## 오브젝트_코드로 이해하는 객체지향 설계 예제 코드

### chapter1 : 티켓 판매 애플리케이션 구현하기
- 진정한 객체지향 설계로 나아가는 길은 협력하는 객체들 사이의 의존성을 적절하게 조절함으로써 변경에 용이한 설계를 만드는 것이다.
- 훌륭한 객체지향 설계의 핵심은 **캡슐화**를 이용해 의존성을 적절히 관리함으로써 객체 사이의 결합도를 낮추는 것이다.
- 변경하기 쉬운 설계는 **한 번에 하나의 클래스**만 변경할 수 있는 설계다.

### chapter2 : 객체지향 프로그래밍
- **객체 지향 프로그래밍을 하며 집중해야할 것 두 가지**
  1. 어떤 클래스가 필요한지를 고민하기 전에 **어떤 객체**들이 필요한지 고민하자.
     - 어떤 객체들이 어떤 상태와 행동을 가지는지를 먼저 결정해야 한다.
  2. 객체를 독립적인 존재가 아니라 기능을 구현하기 위해 **협력**하는 공동체의 일원으로 봐야 한다.
     - 객체를 협력하는 공동체의 일원으로 바라보는 것은 설계를 유연하고 확장 가능하게 만든다.

- 객체의 변경을 관리할 수 있는 기법 중에서 가장 대표적인 것이 **접근 제어**다.
  - 객체 내부에 대한 접근을 **통제**하는 이유는 객체를 **자율**적인 존재로 만들기 위해서다.
- 객체가 **단 하나의 인스턴스 변수만 포함**하더라도 개념을 명시적으로 표현하는 것은 전체적인 설계의 **명확성과 유연성**을 높이는 첫걸음이다.

- **다형성**이란 동일한 메시지를 수신했을 때 객체의 타입에 따라 다르게 응답할 수 있는 능력을 의미한다.
  - `interface` : 구현의 고려 없이 다형적인 협력에 참여하는 경우
  - `abstract class` : **상속**을 통해 다형적인 협력 참여 (공통된 로직을 공유하는 경우)
  
> 💡 유연성이 필요한 곳에 **추상화**를 사용하라

- `Movie` 는 **합성** (인스턴스 변수로 포함해서 재사용)을 이용해 코드를 재사용한다.

### chapter3 : 역할, 책임, 협력
> 💡 객체지향 패러다임의 관점에서 핵심은 역할, 책임, 협력이다.
- **협력**은 애플리케이션의 기능을 구현하기 위해 메시지를 주고받는 객체들 사이의 상호작용이다.
- **책임**은 객체가 다른 객체와 협력하기 위해 수행하는 행동이다.
- **역할**은 다른 것으로 교체할 수 있는 **책임**의 집합이다.
  - **역할**을 이용하면 불필요한 중복 코드를 제거할 수 있다. AND 협력이 더 유연해진다 !
- **추상화**를 사용하면 좋은 점
  - **추상화**를 적절하게 사용하면 불필요한 세부 사항을 생략하고 핵심적인 개념을 강조할 수 있다.
  - **추상화**는 설계를 유연하게 만들 수 있다. 협력안에서 동일한 책임을 수행하는 객체들은 동일한 역할을 수행하기 때문에 대체 가능하기 때문이다.

> 💡 행동에 집중해라. 상태(데이터 주도 설계)에 초점을 맞추게되면 캡슐화를 저해하게 된다.

> 💡 객체를 자율적으로 만드는 가장 기본적인 방법은 내부 구현을 **캡슐화**하는 것이다.

### chapter4 : 설계 품질과 트레이드오프
> 💡 훌륭한 객체지향 설계는 데이터가 아니라 **책임**에 초점을 맞춰야 한다.
> 이유는 **변경**과 관련이 있다. **좋은 설계란 오늘의 기능을 수행하면서 내일의 변경을 수용할 수 있는 설계다.**

**캡슐화**
- 캡슐화는 변경 가능성이 높은 부분을 객체 내부로 숨기는 **추상화 기법**이다.
- 시스템이 완전히 캡슐화된다면 우리는 변경으로부터 완전히 자유로워질 것이다.
- 캡슐화 위반의 example
    - `getter`, `setter`의 사용 👉 객체가 자신의 책임을 다하지 않는다는 것
        - 코드 중복이 발생할 확률이 높아진다.
        - 변경에 취약해진다.
    - 데이터 뿐 아니라, 내부 구현의 변경에 의해 외부 객체가 영향을 받는 모든 것

**응집도와 결합도**
- 높은 응집도와 낮은 결합도를 가진 설계를 추구해야한다.
- 낮은 응집도 example
    - 변경의 이유가 서로 다른 코드들을 하나의 모듈 안에 뭉쳐놓았기 때문에 아무 상관이 없는 코드들이 영향을 받게 된다.
    - 하나의 요구사항 변경을 반영하기 위해 동시에 여러 모듈을 수정해야 한다.
    - 위의 두가지 이유는 리팩토링 사유가 될 것이다🙂

> 💡 올바른 객체지향 설계의 무게 중심은 항상 객체의 내부가 아니라 **외부**에 맞춰져 있어야 한다.
>중요한 것은 다른 객체와 **협력**하는 방법이다.
