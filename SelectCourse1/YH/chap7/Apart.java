package chap7;

import java.util.Arrays;

public class Apart {
    private static int resdientCount;
    private int roomSize;
    private String address;
    private String[] residentName = new String[10];


    public Apart(int roomSize, String address) {
        this.roomSize = roomSize;
        this.address = address;
        resdientCount = 0;
    }

    public int getRoomSize() {
        return this.roomSize;
    }

    public String getAddress() {
        return this.address;
    }

    public int getResidentNumber() {
        return residentName.length;
    }
    public int getResidentCounter(){
        return resdientCount;
    }

    public void addResdient(String name) {
        if (resdientCount > getResidentNumber() - 1) {
            System.out.println("자리가 없음");
        } else if (resdientCount == getResidentNumber() - 1) {
            residentName[resdientCount] = name;
            System.out.println("마지막 손님");
        } else {
            residentName[resdientCount++] = name;
        }
        System.out.println(getResidentNumber() - resdientCount + "자리 남음");
    }

    public String searchForResdientNum(int n) {
        if (n < 0) {
            System.out.println("입력 값 잘못되서 null");
            return null;
        }
        if (n >= resdientCount) {
            System.out.println("자리수 오바해서 null");
            return null;
        } else {
            return residentName[n];
        }

    }

    public void removeForResdientNum(int n) {
        if (n < 0) {
            System.out.println("입력 값 잘못되서 null");
            return;
        }
        if (n >= resdientCount) {
            System.out.println("자리수 오바해서 null");
            return;
        } else {
            for (int i = n; i < resdientCount; i++) {
                residentName[n] = residentName[n + 1];
            }
        }


    }

    @Override
    public String toString() {
        return "roomSize = " + roomSize + ", address = " + address + ", residentName="
                + Arrays.toString(residentName);
    }
}