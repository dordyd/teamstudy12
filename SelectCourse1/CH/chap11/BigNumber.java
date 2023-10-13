package SelectCourse1.CH.chap11;

class intlist {
    int info;
    intlist next;
}

public class BigNumber {
    int length;
    intlist num;

    public BigNumber(String intNum) {
        this.length = intNum.length();
        num = new intlist();
        intlist pointer = num;
        for (int i = length - 1; i >= 0; i--) {
            intlist tmp = new intlist();
            tmp.info = intNum.charAt(i) - '0';
            pointer.next = tmp;
            pointer = pointer.next;
        }
        num = num.next;
    }

    public int plus(BigNumber input) {
        intlist pointer = num;
        intlist inputPointer = input.num;
        int ans = 0;
        int count = 1;
        if (this.length > input.length) {
            for (int i = 0; i < input.length; i++) {
                ans += (pointer.info + inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
            while (pointer != null) {
                ans += pointer.info * count;
                count *= 10;
                pointer = pointer.next;

            }
        } else if (this.length < input.length) {
            for (int i = 0; i < this.length; i++) {
                ans += (pointer.info + inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
            while (inputPointer != null) {
                ans += inputPointer.info * count;
                count *= 10;
                inputPointer = inputPointer.next;
            }
        } else if (this.length == input.length) {
            while (pointer != null) {
                ans += (pointer.info + inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
        }
        return ans;
    }

    public int sub(BigNumber input) {
        intlist pointer = num;
        intlist inputPointer = input.num;
        int ans = 0;

        int count = 1;
        if (this.length > input.length) {
            for (int i = 0; i < input.length; i++) {
                ans += (pointer.info - inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
            while (pointer != null) {
                ans += pointer.info * count;
                count *= 10;
                pointer = pointer.next;

            }
        } else if (this.length == input.length) {
            while (pointer != null) {
                ans += (pointer.info - inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
            if (ans < 0)
                return 0;
        }
        return ans;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        intlist pointer = num;
        while (pointer != null) {
            sb.append(pointer.info);
            pointer = pointer.next;
        }
        return sb.reverse().toString();
    }

    /**
     * this가 크면 1, 같으면 0, 작으면 -1을 return함
     * 
     * @param input
     * @return
     */
    public int compare(BigNumber input) {
        intlist pointer = num;
        intlist inputPointer = input.num;
        int ans = 0;

        int count = 1;
        if (this.length > input.length) {
            return 1;
        } else if (this.length == input.length) {
            while (pointer != null) {
                ans += (pointer.info - inputPointer.info) * count;
                count *= 10;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
            }
        } else {
            return -1;
        }

        if (ans > 0) {
            return 1;
        }
        if (ans < 0) {
            return -1;
        }
        return ans;

    }

    public BigNumber plusTest(BigNumber input) {
        intlist pointer = num;
        intlist inputPointer = input.num;
        BigNumber answer = new BigNumber("1");
        intlist answerPointer = answer.num;
        int ans = 0;
        int carry = 0;
        if (this.length > input.length) {
            for (int i = 0; i < input.length; i++) {
                ans += pointer.info + inputPointer.info + carry;
                carry = ans / 10;
                ans %= 10;
                answerPointer.next = new intlist();
                answerPointer.next.info = ans;
                answerPointer = answerPointer.next;
                pointer = pointer.next;
                inputPointer = inputPointer.next;
                ans = 0;
            }
            while (pointer != null) {
                ans += pointer.info + carry;
                carry = ans / 10;
                ans %= 10;
                answerPointer.next = new intlist();
                answerPointer.next.info = ans;
                answerPointer = answerPointer.next;
                pointer = pointer.next;
                ans = 0;
            }

        }
        answer.num = answer.num.next;
        return answer;
    }

    public static void main(String[] args) {
        BigNumber test = new BigNumber("20000000");
        BigNumber test1 = new BigNumber("1111111");
        System.out.println(test.plusTest(test1));
    }

}
