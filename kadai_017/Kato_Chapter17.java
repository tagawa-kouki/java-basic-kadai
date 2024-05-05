package kadai_017;

public abstract class Kato_Chapter17 {
    // フィールド設定
    public String familyName ="加藤";
    public String givenName="";
    public String address="東京都中野区〇×";

    // メソッド
    public void commonIntroduce() {
        System.out.println("名前は " +this. familyName +this.givenName + " です。");
        System.out.println("住所は " + this.address + " です。");
    }
    
    // 個別の紹介を出力する抽象メソッド
    abstract public void eachIntroduce();
    
    //紹介を実行
    public void execIntroduce() {
    	this.commonIntroduce();
    	this.eachIntroduce();
    }
  
}
