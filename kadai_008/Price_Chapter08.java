package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int age = 30; // 年代

		if( age < 10 ) {
			System.out.println("上記以外の年代の料金は500円");
		} else if( age < 20 ) {
			System.out.println("10代の料金は1000円");
		} else if( age < 30 ) {
			System.out.println("20代の料金は2000円");
		} else if(  age < 40 ) {
			System.out.println("30代の料金は3000円");
		} else if(  age < 50 ) {
			System.out.println("40代の料金は3000円");
		} else if(  age < 60 ) {
			System.out.println("50代の料金は4000円");
		} else if(  age < 70 ) {
			System.out.println("60代の料金は4000円");
		} else if(  age < 80 ) {
			System.out.println("70代の料金は4000円");
		} else if(  age < 90 ) {
			System.out.println("80代の料金は5000円");
		} else {
			System.out.println("上記以外の年代の料金は500円");
		}
	}

}
