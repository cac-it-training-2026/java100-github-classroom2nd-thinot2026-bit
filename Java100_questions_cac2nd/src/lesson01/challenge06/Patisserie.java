/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		//文字列 → 数値（int）に変換、それぞれの購入個数を入力
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		int chocolatBuyCount = Integer.parseInt(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCountStr);
		//ユーザーが入力した数を、それぞれそのまま表示
		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");
		//各マカロンの購入数を すべて足す,合計個数を totalBuyCount に代入
		int totalBuyCount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		//単価 × 個数 をそれぞれ計算,それらをすべて足してtotalPriceに代入
		int totalPrice = 250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount;

		System.out.println("\n合計個数    " + totalBuyCount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		//3種のマカロンそれぞれの在庫を減らす処理
		citronStock = citronStock - citronBuyCount;
		chocolatStock = chocolatStock - chocolatBuyCount;
		pistacheStock = pistacheStock - pistacheBuyCount;

		//残りの在庫をそれぞれ表示
		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

	}

}
