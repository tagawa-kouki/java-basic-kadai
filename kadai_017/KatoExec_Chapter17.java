package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// 加藤太郎のオブジェクト生成
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		taro.setGivenName();
		taro.execIntroduce();
		// 加藤一郎のオブジェクト生成
		KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
		Ichiro.setGivenName();
		Ichiro.execIntroduce();
		// 加藤花子のオブジェクト生成
		KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17();
		Hanako.setGivenName();
		Hanako.execIntroduce();
	}

}
