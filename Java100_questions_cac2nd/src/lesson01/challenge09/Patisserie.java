/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");
		//BufferedReader を使ってキーボードから文字列を入力できるようにする
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//購入個数入力
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");

		//readLine() で 文字列として入力を受け取る
		String citronBuyCountStr = br.readLine();

		//文字列 → 数値（double）に変換、それぞれの購入個数を入力
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		//ユーザーが入力した数を、それぞれそのまま表示
		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		//各マカロンの購入数を すべて足す,合計個数を totalBuyCount に代入
		double totalBuyCount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;

		//単価 × 個数 をそれぞれ計算,それらをすべて足してtotalPriceに代入,(int)()で少数切り捨て
		int totalPrice = (int) (250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount);

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		//3種のマカロンそれぞれの在庫を減らす処理(int)で少数切り捨てに
		citronStock = (int) (citronStock - citronBuyCount);
		chocolatStock = (int) (chocolatStock - chocolatBuyCount);
		pistacheStock = (int) (pistacheStock - pistacheBuyCount);

		//残りの在庫をそれぞれ表示
		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		//8:閉店処理
		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + totalPrice);
		System.out.println("\n内訳");

		//個々の売り上げ（整数型）：値段＊売れた個数
		//個々の売り上げの割合：各売り上げ÷(/)売上合計*100

		System.out.println("シトロン      \\" + (int) (250 * citronBuyCount) + "・・・ "
				+ (int) ((250 * citronBuyCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolatBuyCount) + "・・・ "
				+ (int) ((280 * chocolatBuyCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pistacheBuyCount) + "・・・ "
				+ (int) ((320 * pistacheBuyCount) / totalPrice * 100) + "%");

		//9:三色マカロン
		System.out.println("\n明日の三色マカロンの配合率が決まりました！");

		//各売り上げを各配合率に代入
		int citronPercentage = (int) ((250 * citronBuyCount) / totalPrice * 100);
		int chocolatPercentage = (int) ((280 * chocolatBuyCount) / totalPrice * 100);
		int pistachePercentage = (int) ((320 * pistacheBuyCount) / totalPrice * 100);

		System.out.println("\nシトロンの味    ・・・ " + citronPercentage + "%");
		System.out.println("ショコラの味    ・・・ " + chocolatPercentage + "%");
		System.out.println("ピスターシュの味・・・ " + pistachePercentage + "%");

		System.out.println("\nが楽しめます！");
		//３色値段：総売り上げを総購入数で割り、１０で割った後に１０をかけて１の位を切り捨て
		//252￥/10→25\*10→250\
		System.out.println("\n値段は\\" + ((int) (totalPrice / totalBuyCount) / 10 * 10) + "です。");
	}

}
