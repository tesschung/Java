## Java

> 자바에서 알고리즘 문제풀때 꼭 알아야하는 프레임워크인 듯. 확실히 파이썬하고 많이 다르다. 다른 점이 재밌기도 하다.

# Collection

*프레임워크의 정의*

사용방법을 미리 정해놓은 라이브러리



*컬렉션의 정의*

객체를 수집해서 저장하는 역할을 해준다.



컬렉션 프레임워크는 배열의 문제점을 보완한 프레임워크이다. 배열의 문제점은 다음과 같다.

---

*배열의 문제점*

저장할 수 있는 객체 수가 배열을 **생성할 때** 결정되기 때문에 불특정 다수의 객체를 저장하기에는 불안정하다.

객체를 삭제했을 때 해당 인덱스가 비게되어 낱알이 듬성듬성 빠진 옥수수가 될 수 있다. 그래서 어디가 비어있는지 확인하는 코드가 있어야 한다.

---



컬렉션 프레임워크의 주요 인터페이스로는 `List`, `Set`, `Map`이 있다.

`ArrayList`, `Vector`, `LinkedList`는 `List` interface를 구현한 Class이다.

`HashSet`, `TreeSet`은 `Set` interface를 구현한 Class이다.

`HashMap`, `HashTable`, `TreeMap`, `Properties`는 `Map` interface를 구현한 Class이다.



## List 컬렉션

객체를 **일렬로 늘어놓은 구조**를 가지고 있다.

객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.

객체 자체를 저장하는 것이 아니라 객체의 번지를 참조하기 때문에 종일한 객체를 중복저장할 수 있는데, 이 경우 **동일한 번지가 참조된다**. 그리고, `null` 도 저장 가능한데, 이 경우 **해당 인덱스는 객체를 참조하지 않는다**. 



| 기능      | 메소드                         | 설명                                             |
| --------- | ------------------------------ | ------------------------------------------------ |
| 객체 추가 | boolean add(E e)               | 주어진 객체를 맨 끝에 추가                       |
|           | void add(int index, E element) | 주어진 인덱스에 객체를 추가                      |
|           | E set(int index, E element)    | 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈 |
| 객체 검색 | boolean contains(Object O)     | 주어진 객체가 저장되어있는지 여부                |
|           | E get(int index)               | 주어진 인덱스에 저장된 객체를 리턴               |
|           | boolean isEmpty()              | 컬렉션이 비어있는지 조사                         |
|           | int size()                     | 저장되어있는 전체 객체수를 리턴                  |
| 객체 삭제 | void clear()                   | 저장된 모든 객체를 삭제                          |
|           | E remove(int index)            | 주어진 인덱스에 저장된 객체를 삭제               |
|           | boolean remove(Object o)       | 주어진 객체를 삭제                               |

*`E` 라는 타입 파라미터는 List 인터페이스가 제네릭 타입이기 때문이다.



## ArrayList

`ArrayList`는 `List` interface의 구현 class로, 객체를 추가하면 객체가 인덱스로 관리된다.

배열과는 달리 저장용량을 초과한 객체들이 들어오면 자동적으로 저장용량이 늘어난다. 

*ArrayList 생성*

```java
// 저장할 객체 타입을 타입 파라미터로 표기하고, 기본 생성자 호출
List<String> list = ArrayList<String>();

// 기본적으로 내부에 객체를 10개 저장할 수 있는 초기 용량이 있지만,
// 처음부터 초기용량을 정하고 싶다면, 용량 크기를 매개값으로 적어준다.
List<String> list = ArrayList<String>(30);
```



객체를 추가(add)시 인덱스 0부터 차례대로 저장된다.

특정 인덱스의 객체를 제거(remove)하면 바로 뒤 인덱스부터 마지막 인덱스까지 1씩 당겨진다.

특정 인덱스에 객체를 삽입(set)하면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀려난다.



*고정된 객체들로 구성된 List 생성하기*

```JAVA
List<T> list = Arrays.asList(T... a);

List<String> list = Arrays.asList("a", "b", "c");
List<Integer> list = Arrays.asList(1, 2, 3);
```



## Vector

*Vector 생성*

```java
List<E> list = new Vector<E>();
```



Vector을 사용하면 *스레드가 안전(Thread Safe)*하게할 수 있다. 즉, 동기화된 메소드로 구성되어있어서 *멀티스레드가 동시에 이 메소드를 실행할 수 없고*, 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 할 수 있다.



## LinkedList

인접 참조를 링크해서 체인처럼 관리한다. 

특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 이는 특정 인덱스에 객체를 삽입할때도 마찬가지다.

*LinkedList 생성*

```java
List<E> list = new LinkedList<E>();
```



## Set 컬렉션

저장 순서가 유지되지 않는다.

객체를 중복해서 저장할 수 없다. (하나의 null만 저장할 수 있다.)

| 기능      | 메소드                     | 설명                                                         |
| --------- | -------------------------- | ------------------------------------------------------------ |
| 객체 추가 | boolean add(E e)           | 주어진 객체를 저장, 객체가 성공적으로 저장되면 true, 중복 객체면 false를 리턴 |
| 객체 검색 | boolean contains(Object o) | 주어진 객체가 저장되어 있는지 여부                           |
|           | boolean isEmpty()          | 컬렉션이 비어있는지 조사                                     |
|           | Iterator<E> iterator()     | 저장된 객체를 한번씩 가져오는 반복자 리턴                    |
|           | int size()                 | 저장되어 있는 전체 객체 수 리턴                              |
| 객체 삭제 | void clear()               | 저장된 모든 객체를 삭제                                      |
|           | boolean remove(Object o)   | 주어진 객체를 삭제                                           |

*인덱스로 관리하지 않아서 인덱스를 매개값으로 갖는 메소드가 없다.



*Set 생성*

```java
Set<String> set = ...;

// Set컬렉션은 인덱스로 가져오는 반복자가 없어서
// 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자를 제공
Iterator<String> iterator = set.iterator();
```



Iterator 인터페이스를 구현한 객체에서 사용할 수 있는 메소드들이다.

| 리턴타입 | 메소드명  | 설명                                                         |
| -------- | --------- | ------------------------------------------------------------ |
| boolean  | hasNext() | 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴한다. |
| E        | next()    | 컬렉션에서 하나의 객체를 가져온다                            |
| void     | remove()  | Set컬렉션에서 객체를 제거한다.                               |



*Set을 looping하는 여러가지 방법*

```java
Set<String> set = new HashSet<String>();
set.add("A");
set.add("B");
set.add("C");
Iterator<String> iterator = set.iterator();

// Iterator을 사용하고 looping
while (iterator.hasNext()) { // true 라면 looping
    String str = iterator.next();
    System.out.println(str);
}

// Iterator을 사용하지 않고 looping
for(String str:set) {
    System.out.println(str);
}
```



## HashSet

`Set` interface의 구현 class이다

*Hashset 생성*

```java
Set<E> set = new HashSet<E>();
```



*HashCode가 공일한 객체를 중복 저장하지 않는 내부 동작방식*

(1)HashSet은 객체를 저장하기 이전에 먼저 객체의 `hashCode()` 메소드를 호출해서 **해시코드를 얻는다.**

(2)이미 저장되어있는 객체들의 해시코드와 비교한다. 만약 동일한 해시코드가 있다면 `equals()` 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.



## Map 컬렉션

key와 value로 구성된 entry객체를 저장하는 구조이다. 여기서 key와 value는 **모두 객체이다**. key는 중복될 수 없지만, value는 중복될 수 있다. 만약 기존에 저장된 key와 동일한 key로 value를 저장하면 기존의 value는 없어지고, 새로운 value로 대체된다.

| 기능      | 메소드                              | 설명                                                         |
| --------- | ----------------------------------- | ------------------------------------------------------------ |
| 객체 추가 | V put(K key, V value)               | 주어진 키로 값을 저장, 새로운 키일 경우 null을 리턴하고 동일한 키가 있을 경우 값을 대체하고 이전 값을 리턴 |
| 객체 검색 | boolean containsKey(Object Key)     | 주어진 키가 있는지 여부                                      |
|           | boolean containsValue(Object Value) | 주어진 값이 있는지 여부                                      |
|           | Set<Map.Entry<K,V> entrySet()       | 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴 |
|           | V get(Object Key)                   | 주어진 키가 있는 값을 리턴                                   |
|           | boolean isEmpty()                   | 컬렉션이 비어있는지 여부                                     |
|           | Set<K> KeySet()                     | 모든 키를 Set 객체에 담아서 리턴                             |
|           | int size()                          | 저장된 키의 총 수를 리턴                                     |
|           | Collection<V> values()              | 저장된 모든 값을 Collection에 담아서 리턴                    |
| 객체 삭제 | void clear()                        | 모든 Map.Entry(키와 값)을 삭제                               |
|           | V remove(Object key)                | 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴          |

*키로 객체들을 관리하기 때문에 키를 매개값으로 갖는 메소드가 많다.



*객체를 찾아오는 3가지 방법*

```java
// (1) 키를 알고있는 경우, get() 메소드로 간단하게 객체를 찾아오기
Map<String, Integer> map = ...;
map.put("A", 1);
int score = map.get("A");

// (2) KeySet() 메소드로 모든 키를 Set 컬렉션으로 얻은 다음, 
// 반복자를 통해 키를 하나씩 얻고 get() 메소드를 통해 값을 얻기
Map<K, V> map = ...;
Set<K> KeySet = map.KeySet();
Iterator<K> keyIterator = KeySet.iterator();
while (keyIterator.hasNext()) {
  K key = keyIterator.next();
  V value = map.get(key);
}

// (3) entrySet()메소드로 모든 Map.Entry 를 Set컬렉션으로 얻은 다음, 
// 반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와 getValue() 메소드를 이용해 키와 값을 얻기
Set<Map.Entry<K,V>> entrySet = map.entrySet();
Iterator<Map.Entry<K,V>> entryIterator = entrySet.iterator();
while(entryIterator.hasNext()) {
  Map.Entry<K,V> entry = entryIterator.next();
  K key = entry.getKey();
  V value = entry.getValue();
}
```





