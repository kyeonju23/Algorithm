# Algorithm(Java)
## Baekjoon

## Programmers
- Level 0: 코딩테스트 입문

## note
- 문자열 자르기
    - `split()`: 어떤 문자 기준으로 문자열을 자르고 배열로 리턴
    - `substring()`: 인자로 전달된 index를 기준으로 문자열을 자르고 String을 리턴
    
- String 클래스 메서드
    - `charAt()`: 문자열 특정 인덱스에 해당하는 문자 반환
    - `compareTo()`: 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교(대소문자 구분)
    - `concat()`: 인수로 전달된 문자열을 추가한 새로운 문자열 반환
    - `indexOf()`: 특정 문자나 문자열이 처음 등장하는 위치의 인덱스 반환
    - `trim()`: 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백문자 제거
    - `toLowerCase(), to UpperCase()`: 해당 문자열을 소문자, 대문자로 변환

- StringBuffer instance
    - `append()`: 인수로 전달된 값을 문자열로 변환 후, 해당 문자열의 마지막에 추가
    - `capacity()`: 현재 버퍼 크기 반환
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