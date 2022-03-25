package leetcode;

/**
 * @Auther: zls
 * @Date: 2022/3/22 09:04
 * @Description:
 */
public class FB {

    public static int fb(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fb(n - 1) + fb(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fb(2));
        System.out.println(fb(3));
        System.out.println(fb(4));
        System.out.println(fb(5));
        System.out.println(fb(6));
        System.out.println(fb(7));
        System.out.println(fb(8));
        System.out.println(fb(9));
    }

}
