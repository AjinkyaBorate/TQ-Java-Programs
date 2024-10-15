package exceptionhandling;

public class ForMultipleCatch {

	public static void main(String[] args) {
		String[] s = { "abc", "123", null, "xyz" };
		for (int i = 0; i < 6; i++) {
			try {
				@SuppressWarnings("unused")
				int a = s[i].length() + Integer.parseInt(s[i]);
			}
//			catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
//				System.out.println(ex);//multi catch exception with pipe symbol
//			}
			catch (NumberFormatException ex) {
				System.out.println("NumberFormatException will be caught here");

			} catch (NullPointerException ex) {
				System.out.println("NullPointerException will be caught here");
			} 
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("ArrayIndexOutOfBoundsException will be caught here");

			}
			catch (Exception ex) {
				System.out.println(ex);
			}

			System.out.println("After executing respective catch block, this statement will ne executed");
		}
	}

}
