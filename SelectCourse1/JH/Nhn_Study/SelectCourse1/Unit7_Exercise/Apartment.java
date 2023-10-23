package Unit7_Exercise;

public class Apartment {
    private int size;
    private String address;
    private String[] residents;
    private int numberOfResidents;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new String[10];
        this.numberOfResidents = 0;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void addResident(String name) {

        if (numberOfResidents < 10) {
            residents[numberOfResidents] = name;
            numberOfResidents++;
        }
    }

    public String getResident(int number) {

        if (number >= 0 && number < numberOfResidents) {
            return residents[number];
        }
        return null;
    }

    public void removeResident(int number) {
        if (number >= 0 && number < numberOfResidents) {
            for (int i = number; i < numberOfResidents - 1; i++) {
                residents[i] = residents[i + 1];
            }
            residents[numberOfResidents - 1] = null;
            numberOfResidents--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("아파트 크기: ").append(size).append(" 제곱미터\n");
        sb.append("주소: ").append(address).append("\n");
        sb.append("거주자 목록:\n");
        for (int i = 0; i < numberOfResidents; i++) {
            sb.append("번호 ").append(i).append(": ").append(residents[i]).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Apartment apartment = new Apartment(38, "필문대로 70");

        System.out.println("<아파트 정보>");
        System.out.println(apartment);
        System.out.println("====================================");

        apartment.addResident("정훈");
        apartment.addResident("윤호");
        apartment.addResident("철환");


        System.out.println("현재 거주자 수 : " + apartment.getNumberOfResidents());
        System.out.println("====================================");


        System.out.println("<거주자 정보>");
        for (int i = 0; i < apartment.getNumberOfResidents(); i++) {
            String resident = apartment.getResident(i);
            System.out.println("거주자 " + i + " : " + resident);
        }
        System.out.println("====================================");


        apartment.removeResident(1);


        System.out.println("<삭제 후 거주자 정보>");
        for (int i = 0; i < apartment.getNumberOfResidents(); i++) {
            String resident = apartment.getResident(i);
            System.out.println("거주자 " + i + ": " + resident);
        }
    }

}
