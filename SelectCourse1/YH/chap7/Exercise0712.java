package chap7;

public class Exercise0712 {
//     아파트(Apartment)라는 Java 클래스를 구현해보겠습니다. 이 클래스의 객체는 다음과 같은 정보를 유지합니다: 아파트의 평방 미터 크기를 나타내는 정수, 주소, 아파트에 거주하는 최대 10명의 사람 이름 목록입니다. 아파트에 거주하는 각 사람은 0부터 현재 아파트에 거주하는 사람 수 - 1까지의 번호가 지정됩니다. 이 클래스는 다음과 같은 기능을 제공합니다:

//     • 크기와 주소를 인자로 받아 초기에 비어있는 아파트를 생성하는 생성자
//     • 아파트의 크기를 반환하는 메서드
//     • 아파트의 주소를 반환하는 메서드
//     • 현재 아파트에 거주하는 사람 수를 반환하는 메서드
//     • 인자로 받은 이름을 가진 사람을 아파트에 추가하는 메서드; 여전히 자리가 남아있다면 해당 인원에게 다음 사용 가능한 번호가 할당됩니다. 만약 아파트가 가득 찼다면(즉, 이미 10명이 거주 중인 경우), 메서드는 동작하지 않습니다.
//     • 음이 아닌 정수 번호를 인자로 받고, 해당 번호와 연관된 이름을 가진 사람을 찾아 반환합니다. 만약 번호가 현재 거주 중인 사람 수보다 크거나 같다면, 메서드는 null을 반환합니다.
//     • 음이 아닌 정수 번호를 인자로 받고, 해당 번호와 연관된 사람을 아팠에서 제거합니다. 그 후 이후의 모든 사랍들의 번호는 하나씩 감소되어야 합니다. 만약 번호가 현재 거주 중인 사랍 수보다 크거나 같다면, 메서드는 동작하지 않습니다.
//     • Object에서 상속받은 toString() 메서드를 오버라이딩하여 모든 정보가 포함된 문자열을 반환하는 toString() 메서드

    public static void main(String[] args) {
        Apart apart = new Apart(10, "전주");
        apart.addResdient("윤호");
        apart.addResdient("정훈");
        apart.addResdient("철환");
        apart.addResdient("아영");
        apart.addResdient("ㅋ");
        System.out.println(apart);
        apart.removeForResdientNum(4);
        System.out.println(apart);
        System.out.println(apart.searchForResdientNum(4));
    }
}
