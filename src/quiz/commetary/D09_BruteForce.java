package quiz.commetary;

public class D09_BruteForce {
	
	
	static String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
	
	public static void main(String[] args) {
		bruteforce(2);
	}

	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (int) Math.pow(charset.length(), password_size);
		
		for(long i = 0; i < all_password ; i++) {
			
			long value = i;
			String password = "";
			while(value > 0) {
				password += arr[(int)(value % len)];
				value /= len;
			}
			
			if (password.length() < password_size) {
				int gap = password_size - password.length();
				for(int j = 0; j < gap; j++) {
					password = "a" + password;
				}
			}
			System.out.println(password);
		}
		System.out.println("len :" + len);
		
	}
}
