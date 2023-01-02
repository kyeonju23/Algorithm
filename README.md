# Algorithm(Java)
## Baekjoon
- Solved.ac 
    - 새싹(출력, 입력과 연산, 조건, 반복, 빠른 입출력, 배열)
- Bronze
- Silver

## Programmers
- Level 0: 코딩테스트 입문

## note
- Condition Operator
    Condition ? A : B
    - Condition: True or False 조건식
    - `?`: 뒤에 오는 값이 Condition에 따른 리턴값임을 알려주는 약속어
    - A: Condition의 결과가 True일 때 반환값
    - B: Condition의 결과가 False일 때 반환값

- 문자열 자르기
    - `split()`: 어떤 문자 기준으로 문자열을 자르고 배열로 리턴
    - `substring()`: 인자로 전달된 index를 기준으로 문자열을 자르고 String을 리턴
    
- String 클래스 메서드
    - `equals()`: 두개의 문자열이 동일하지 비교, 문자열의 값을 비교 (`==`연산자와 다름, 객체를 비교)
    - `charAt()`: 문자열 특정 인덱스에 해당하는 문자 반환
    - `compareTo()`: 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교(대소문자 구분)
    - `concat()`: 인수로 전달된 문자열을 추가한 새로운 문자열 반환
    - `contains()`: 특정 문자열이 포함되어있는지 여부를 비교
    - `indexOf()`: 특정 문자나 문자열이 처음 등장하는 위치의 인덱스 반환
    - `replaceAll()`: 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용
    - `substring()`: 문자열 중 특정 부분을 뽑아낼 경우 사용
    - `split()`: 문자열을 특정 구분자로 나누어 문자열로 리턴
    - `trim()`: 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백문자 제거
    - `toLowerCase(), to UpperCase()`: 해당 문자열을 소문자, 대문자로 변환

- StringBuffer instance
    - `append()`: 인수로 전달된 값을 문자열로 변환 후, 해당 문자열의 마지막에 추가
    - `capacity()`: 현재 버퍼 크기 반환
    - `substring(start, end)`: 객체의 시작 위치에서 끝 위치까지 반환
    - `delete(), insert()`: 삭제, 삽입

- Arrays 클래스
    1. 배열 복사
        - `copyOf(원본 배열, 새로운 배열로 복사할 요소의 개수)`: 특정 길이만큼 새로운 배열로 복사 반환
        - `copyOfRange(원본 배열, 복사 시작 인덱스, 복사될 배열 인덱스 + 1)`: 특정 범위에 해당하는 요소만들 새로운 배열로 복사 반환
    2. 정렬
        - `sort()`
    3. 검색
        - `binarySearch(arr, find_value)`
    4. 동일 항목 채우기
        - `fill(arr, value)`
        - `fill(arr,start_index, end_index, value)`

- List
    - ArrayList
        `add()`, `get()`, `size()`, `contains()`: 리스트 안에 해당 항목이 있는지 판별(boolean), `remove(Object or Index)`

- 입력받기
    - Scanner scan = new Scanner(System.in)
    - `next()`: 공백 이전까지의 문자열 입력받기
        - 정수, 실수 입력 받기: next + 자료형()
            - nextInt(), nextLong() ...
    - `nextLine()`: 문자열 전체 입력받기
    
