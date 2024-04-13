package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int  userAge =  30; // 年代
        String serviceCost = ""; // 料金

        // 年代に応じた料金を取得
        serviceCost = switch(userAge) {
            case 10  -> "10代の料金は1000円";
            case 20  -> "20代の料金は2000円";
            case 30  -> "30代の料金は3000円";
            case 40  -> "40代の料金は3000円";
            case 50  -> "50代の料金は4000円";
            case 60  -> "60代の料金は4000円";
            case 70  -> "70代の料金は4000円";
            case 80  -> "80代の料金は5000円";
            default -> "上記以外の年代の料金は500円";
        };

        // 料金を表示
        System.out.println(serviceCost);
	}

}
