## 오브젝트_코드로 이해하는 객체지향 설계 예제 코드

### chapter1. 티켓 판매 애플리케이션 구현하기
- 진정한 객체지향 설계로 나아가는 길은 협력하는 객체들 사이의 의존성을 적절하게 조절함으로써 변경에 용이한 설계를 만드는 것이다.
- 훌륭한 객체지향 설계의 핵심은 **캡슐화**를 이용해 의존성을 적절히 관리함으로써 객체 사이의 결합도를 낮추는 것이다.
- 변경하기 쉬운 설계는 **한 번에 하나의 클래스**만 변경할 수 있는 설계다.

### chapter2. 객체지향 프로그래밍
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

### chapter3. 역할, 책임, 협력
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

### chapter4. 설계 품질과 트레이드오프
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

### chapter5. 책임 할당하기
> 💡 데이터 중심 설계로 인해 발생하는 문제점을 해결할 수 있는 가장 기본적인 방법은 데이터가 아닌 **책임**에 초점을 맞추는 것이다.

- **책임 중심의 설계를 하기 위해서는 메시지를 결정한 후에 객체를 선택해야 한다.**
    1. "이 객체가 수행해야 하는 책임은 무엇인가"를 먼저 결정하자
    2. "이 책임을 수행하는 데 필요한 데이터는 무엇인가" 를 결정한다.
- 책임을 할당할 수 있는 다양한 대안들이 존재한다면 **응집도와 결합도 측면에서 더 나은 대안**을 선택하자

> 💡 설계를 개선하는 작업은 변경의 이유가 하나 이상인 클래스를 찾는 것으로부터 시작하는 것이 좋다.
- 응집도가 높은 클래스는 인스턴스를 생성할 때 모든 속성을 함께 초기화한다.
  - 일부만 초기화하고 일부는 초기화하지 않은 상태로 남겨둔다는 것은 응집도가 낮다는 말이다.
    
  👉 함께 초기화되는 속성을 기준으로 코드를 분리하자.
- 메서드들이 인스턴스 변수를 사용하는 방식을 확인하자
  - 메서드들이 사용하는 속성에 따라 그룹이 나뉜다면 클래스의 응집도가 낮다고 볼 수 있다. 
  
  👉 속성 그룹과 해당 그룹에 접근하는 메서드 그룹을 기준으로 코드를 분리하자.
  
> 💡 최대한 빠르게 목적한 기능을 수행하는 코드를 작성하라.
>  절차형 코드로 실행되는 프로그램을 빠르게 작성한 후 완성된 코드를 객체지향적인 코드로 변경하라.
>
> 아무것도 없는 상태에서 책임과 협력에 대해 고민하기 보다는 일단 실행되는 코드를 얻고 난 후에 코드 상에 명확하게
>드러나는 책임들을 올바른 위치로 이동시키자.

**메서드는 작은 메스드로 분리하자.**
- 이해하기 쉬워진다.
- 고수준의 메소드를 볼 때 일련의 주석을 읽는 것 같은 느낌이 들게 할 수 있다.
- 잘게 나누어져 있으면 다른 메서드에서 사용할 확률이 높아진다.

**긴 메서드의 단점**
- 이해하는 데 많은 시간이 걸린다.
- 변경이 필요할 때 수정해야 할 부분을 찾기 어렵다.
- 메서드 로직 중 일부만 수정하더라도 나머지 부분에서 버그가 발생할 확률이 높다.
- 로직이 일부만 재사용하기 어렵다. = 코드 중복이 발생할 가능성이 크다. 

### chapter6. 메시지와 인터페이스
#### : **퍼블릭 인터페이스 (객체가 수신하는 메세지)** 를 만드는 데 도움이 되는 설계의 원칙과 기법

> 💡 훌륭한 객체지향 코드를 얻기 위해서는 클래스가 아니라 **객체**를 지향해야 한다. 즉, 객체가 수행하는 **책임**에 초점을 맞춰야한다는 말이다.

#### 퍼블릭 인터페이스의 품질에 영향을 미치는 원칙과 기법
- 디미터 법칙
    - 객체의 내부 구조에 강하게 결합되지 않도록 협력 경로를 제한하라는 것
    - '도트(.)'를 이용해 메시지 전송을 표현하는 언어에서 오직 하나의 도트만 사용하라라는 의미
        - 이 때, **객체의 내부 구조**를 노출하고 있는 경우에만 해당된다. 
    - 오직 인접한 이웃하고만 말하라
    
    👉 클라이언트와 서버 사이에 낮은 결합도를 유지할 수 있다.
    
    👉 단지 자신이 원하는 것이 무엇인지를 명시하고 단순히 수행하도록 요청하게 한다.
- 묻지말고 시켜라
    - 외부에서 상태를 변경하는 경우에 해당된다.
- 의도를 드러내는 인터페이스
    - 구현과 관련된 모든 정보를 캡슐화하고 객체의 퍼블릭 인터페이스에는 협력과 관련된 의도만을 표현해야 한다는 것
    - **이름을 지을 때**는 '어떻게'하는 지가 아닌 **'무엇'** 을 하느냐에 따라 짓는 것이 좋다.
- 명령-쿼리 분리
    - "질문이 답변을 수정해서는 안된다."
    - **명령**은 상태를 변경할 수 있지만 상태를 변경해서는 안 된다. **쿼리**는 객체의 상태를 반환할 수 있지만 상태를 변경해서는 안된다.
    - 명령과 쿼리를 뒤섞으면 실행 결과를 예측하기가 어려워질 수 있다.
        ```
        isSatisfied() 
        ````
      
        - 위의 메소드를 호출했는 데, 상태가 변한다면 ? 👉 굉장히 큰 혼란을 줄 수 있다.
        
    👉 **명령**과 **쿼리**를 분리함으로써, 코드는 예측 가능하고 이해하기 쉬우며 디버깅이 용이한 동시에 유지보수가 수월해질 것이다.
    
    👉 **참조 투명성**의 장점을 제한적이나마 누릴 수 있다. (**참조 투명성**이란 어떤 표현식 e가 있을 때 e의 값으로 e가 나타나는 모든 위치를 교체하더라도 결과가 달라지지 않는 특성을 의미한다.)
    👉 버그가 적고, 디버깅이 용이하며, **쿼리의 순서에 따라 실행 결과가 변하지 않는 코드**를 작성할 수 있다.
    
#### 원칙의 함정
**원칙을 아는 것보다 더 중요한 것은 언제 원칙이 유용하고 언제 유용하지 않은지를 판단할 수 있는 능력을 기르는 것이다.**

> 💡 **소프트웨어 설계에 법칙이란 존재하지 않는 것이다. 원칙을 맹신하지 마라.**
>
> 원칙이 적절한 상황과 부적절한 상황을 판단할 수 있는 안목을 길러라. 설계는 트레이드 오프 산물이다.
>소프트웨어 설계에 존재하는 몇 안되는 법칙 중 하나는 "경우에 따라 다르다"라는 사실을 명심하라.

### chapter7. 객체 분해
> 💡 새로운 타입을 빈번하게 추가해야 한다면 **객체지향의 클래스 구조**가 더 유용하다.
> 새로운 오퍼레이션을 빈번하게 추가해야 한다면 **추상 데이터 타입**을 선택하는 것이 현명한 판단이다.
> 변경의 축을 찾아라. 객체지향적인 접근법이 모든 경우에 올바른 해결 방법인 것은 아니다.

### chapter8. 의존성 관리하기
> 💡 객체지향 설계의 핵심은 **협력**을 위해 필요한 의존성은 유지하면서도 변경을 방해하는 **의존성**은 제거하는 데 있다.

#### 런타임 의존성 vs 컴파일 의존성
- 런타임 의존성 : 말그대로 실행 시점의 의존성이다. (코드가 실행되는 시점)
- 컴파일 의존성 : 코드 그 자체 (컴파일 하는 시점)

실제로 협력할 객체가 어떤 것인지는 **런타임**에 해결해야 한다.

#### 의존성 해결하기
- 객체가 생성하는 시점에 **생성자**를 통해 의존성 해결
    - 객체 생성 시 완전한 객체로 생성 가능
- 객체 생성 후 **setter method**를 통해 의존성 해결
    - 객체 생성 시 불완전한 객체 생성
    - 필요에 따라 의존성 변경 가능
- 메서드 실행 시 **인자**를 이용해 의존성 해결
    - 매번 동일한 인자를 받는 경우에는 유용하지 않다, 변경이 많이된다면 사용하자

생성자, setter method 방식을 혼합하여 의존성을 해결하자. 완전한 상태의 객체를 생성한 후, 필요에 따라 의존 대상을 변경할 수 있도록 구현하자.

안정적으로 유지하면서도 유연성을 향상시킬 수 있다.

#### 유연한 설계
> 💡 두 요소 사이에 존재하는 의존성이 바람직할 때 두 요소가 **느슨한 결합도** or **약한 결합도**를 가진다.
> 이 요소를 만족시키기 위한 효과적인 방법은 **추상화**이다.

바람직한 의존성은 **재사용성**과 관련이 있다. 어떤 의존성이 다양한 환경에서 재사용할 수 있다면, 그 의존성은 바람직한 것이다.

### chapter9. 유연한 설계
> 💡 **개방-폐쇄 원칙**은 유연한 설계란 기존 코드를 수정하지 않고도 애플리케이션의 동작을 확장할 수 있는 설계라고 이야기한다.
> 
> **추상화가 핵심이다.** 단, 추상화를 했다고 해서 모든 수정에 대해 설계가 폐쇄되는 것은 아니다. 올바른 설계가 중요하다.

#### 의존성 주입
> 💡 **명시적 의존성**이 **숨겨진 의존성**보다 좋다.
> 가급적 의존성을 객체의 퍼블릭 인터페이스에 노출하라. 의존성을 구현 내부에 숨기면 숨길수록 코드를 이해하기도, 수정하기도 어려워진다.

#### 의존성 역전 원칙
> 💡 **추상화에 의존하라**
>
> 유연하고 재사용 가능한 설계를 원한다면 모든 의존성의 방향이 추상 클래스나 인터페이스와 같은 추상화를 따라야 한다.

1. 상위 수준의 모듈은 하위 수준의 모듈에 의존해서는 안된다. 둘 모두 **추상화**에 의존해야 한다.
2. 추상화는 구체적인  사항에 의존해서는 안 된다. 구체적인 사항은 추상화에 의존해야 한다.

**모듈 구조를 설계하는 데에도 가장 중요한 핵십 원칙이다.** 인터페이스 소유권을 서버가 아닌 클라이언트에 위치시키자.
불필요한 빌드를 방지한다. (변경이 많이 되는 부분 / 고정된 부분) && (컴파일 타임의 의존성, 추상 클래스는 클래라이언트와 함께 빌드되어야 한다.)

> 💡 **역할, 책임, 협력에 먼저 집중하라**
>
>**객체를 생성하는 방법에 대한 결정**은 모든 책임이 자리를 잡은 후 가장 마지막 시점에 내리는 것이 적절하다.

### chapter10. 상속과 코드 재사용
중복 코드는 변경을 방해한다. 이것이 중복 코드를 제거해야 하는 가장 큰 이유다.

신뢰할 수 있고 수정하기 쉬운 소프트웨어를 만드는 효과적인 방법 중 하나는 **중복을 제거하는 것**이다.

✔ 상속을 통해 중복을 제거할 수 있다. 단, 부모&자식 클래스 사이의 강한 결합이 코드를 수정하기 어렵게 만들 수 있다.

👉 이러한 문제를 해결하는 가장 일반적인 방법은 자식 클래스가 부모 클래스의 구현이 아닌 **추상화**에 의존하도록 만드는 것이다.

1. 두 메서드가 유사하게 보인다면 차이점을 메서드로 추출하라
2. 부모 클래스의 코드를 하위로 내리지 말고 **자식 클래스의 코드를 상위로 올려라**

👉 추상화에 의존함으로써, 개방-폐쇄 원칙도 준수하며, 낮은 결합도를 유지할 수 있게 된다.

> 💡 핵심 로직은 한 곳에 모아놓고 캡슐화 해야하며, 공통적인 핵심 로직은 최대한 **추상화**하자.

### chapter11. 합성과 유연한 설계
합성을 사용하면 구현이 아닌 퍼블릭 인터페이스에 대해서만 의존할 수 있기 때문에 런타임에 객체의 관계를 변경할 수 있다.

**즉, 코드를 재사용하면서도 건전한 결합도를 유지할 수 있는 더 좋은 방법은 상속보다는 합성이다.**

### chapter12. 다형성
✔ 업캐스팅
- 부모 타입에 자식 클래스 할당하는 것

✔ 동적 바인딩
- 객체의 타입에 따라 실행되는 메서드가 동적으로 변경하는 것

✔ `self` vs `super`
`self`참조는 어떤 클래스에서부터 메시지 탐색이 시작될지 알지 못한다. 메세지를 수신한 객체가 `self`가 된다.

`super`참조는 항상 **해당 클래스**의 부모 클래스에서부터 메서드 탐색을 시작한다.

즉, `self` 전송은 메서드 탐색을 시작할 클래스를 반드시 실행 시점에 **동적으로** 결정해야 하지만,
`super` 전송의 경우 **컴파일 시점에 미리** 결정할 수 있다.

### chapter13. 서브클래싱과 서브타이핑
#### ✔ 타입
> 💡 객체의 타입을 결정하는 것은 내부의 속성이 아니라 객체가 외부에 제공하는 **행동**이라는 사실을 기억하라
>
> 객체의 **퍼블릭 인터페이스**가 객체의 **타입**을 결정한다.
>따라서, 동일한 퍼블릭 인터페이스를 제공하는 객체들은 동일한 타입으로 분류된다.

#### ✔ 아래의 두가지 경우를 만족하는 경우에만 **상속**을 사용하라
- 상속 관계가 is-a 관계를 모델링하는가?
  - [자식클래스]는 [부모클래스]다 라고 말할 수 있는지
- 클라이언트 입장에서 부모 클래스의 타입으로 자식 클래스를 사용해도 무방한가?
  - 이는 **행동 호환성**을 만족하는 것 (여기서 **행동 호환성**은 클라이언트 관점에서 바꿔치기할 수 있냐이다)
> 올바른 상속 관계를 구축하기 위해서는
> 재사용 관점보다 **타입 계층 구성을 할 수 있는지 여부이다. (행동이 호환될 수 있는지! & 대체 가능성)**

#### ✔ 리스코프 치환 원칙
리스코프 치환 원칙을 한마디로 정리하면 "서브타입은 그것의 기반 타입에 대해 대체 가능해야 한다"

**행동 호환성과 대체 가능성은 올바른 상속 관계를 구축하기 위해 따라야할 지침이다.**

또한, 대체가능성을 결정하는 것은 **클라이언트**이다.

### appendixA. 계약에 의한 설계
> 💡 **클라이언트 관점**에서 부모 클래스에 대해 기대했던 것보다 더 적은 일을 수행하는 자식 클래스는 부모 클래스와 동일하지 않다.
> 부모 클래스보다 못한 자식 클래스는 서브타입이 아니다.

* 계약에 의한 설계의 관점에서 리스코프 치환 원칙이 가지는 의미를 이해하자.
    - 서브타입이 슈퍼타입을 치환할 수 있다는 것은 계약에 의한 설계에서 정의한 **계약 규칙**과 **가변성 규칙**을 준수하는 것이다.