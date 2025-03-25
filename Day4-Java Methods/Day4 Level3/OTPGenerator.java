import java.util.HashSet;
public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); 
    }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}
