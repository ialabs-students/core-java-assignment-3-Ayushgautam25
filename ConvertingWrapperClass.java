public class ConvertingWrapperClass {

	public static void convertToWrapper(Object primitive){
		
		if(primitive instanceof Integer) {
			Integer in = (Integer) primitive;
			System.out.println(in);
		}
		else
			if(primitive instanceof Character) {
				Character ch = (Character) primitive;
				System.out.println(ch);
			}
		else
			if(primitive instanceof Byte) {
				Byte by = (Byte) primitive;
				System.out.println(by);
			}
		else
			if(primitive instanceof Short) {
				Short sh = (Short) primitive;
				System.out.println(sh);
			}
		else
			if(primitive instanceof Long) {
				Long l = (Long) primitive;
				System.out.println(l);
			}
		else
			if(primitive instanceof Float) {
				Float f = (Float) primitive;
				System.out.println(f);
				}
		else
			if(primitive instanceof Double) {
				Double d = (Double) primitive;
				System.out.println(d);
			}
		else
			if(primitive instanceof Boolean) {
				Boolean boo = (Boolean) primitive;
				System.out.println(boo);
			}
		else {
			System.out.println("Give proper primitive as input");
		}
	}
	public static void main(String[] args) {
		char ab = 'a';
		byte cd = 3;
		short ef = 65;
		int gh = 150;
		long ij = 1000000;
		float kl = 3.42f;
		double mn = 38683.34;
		boolean op = true;
		convertToWrapper(ab);
		convertToWrapper(cd);
		convertToWrapper(ef);
		convertToWrapper(gh);
		convertToWrapper(ij);
		convertToWrapper(kl);
		convertToWrapper(mn);
		convertToWrapper(op);
	}

}
