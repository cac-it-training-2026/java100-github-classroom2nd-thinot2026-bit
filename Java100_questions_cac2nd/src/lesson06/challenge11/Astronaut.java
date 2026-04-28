/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題11 Stringクラス③（indexOf）
 *
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。
 *
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 *
 * <実行例1>
 *
 * γ星人にアイテムを渡してください＞TanquerayNo.10
 *
 * γ星人：
 * こんな良いものをもらっていいガンマか！
 * ゆっくりしていくガンマ。
 *
 * <実行例2>
 *
 * γ星人にアイテムを渡してください＞orange
 *
 * γ星人：
 * ...ありがとガンマ。
 * ぶぶ漬けでもいかがガンマか？
 *
 */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにGammalianクラスを記述する

class Gammalian {

	private String item; // 渡されたアイテム名
	private boolean isGood; // 気に入った（数字入りである）かどうかのフラグ

	public String getItem() {
		return item;
	}

	// アイテムを受け取り、お気に入りかどうかを判定して保持するメソッド
	public void setItem(String item) {
		boolean isHit = false; // 数字が見つかったかどうかを記録する一時的な変数

		// 0 から 9 までの数字が含まれているかを順番にチェックする
		for (int i = 0; i < 10; i++) {
			// Integer.toString(i) で数値の 0〜9 を文字列の "0"〜"9" に変換
			// indexOf は指定した文字が見つからない場合に -1 を返すため、
			// 「!= -1」は「見つかった（含まれている）」という条件になる
			if (item.indexOf(Integer.toString(i)) != -1) {
				isHit = true; // 数字が見つかったのでフラグを true に
				break; // 1つでも数字が見つかれば十分なので、ここでループを終了
			}
		}

		// 発見フラグ(isHit)の状態をそのままお気に入りフラグ(isGood)に反映
		if (isHit) {
			isGood = true;
		} else {
			isGood = false;
		}
		this.item = item;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine(); // ユーザーからの入力を受け取る

		// 1. γ星人オブジェクトを生成
		Gammalian gammalian = new Gammalian();

		// 2. アイテムを渡す（ここで数字チェックが実行される）
		gammalian.setItem(present);

		// 3. γ星人が気に入ってくれたかどうかの結果を受け取る
		boolean isGood = false;
		isGood = gammalian.isGood();

		System.out.println("\nγ星人：");

		// フラグの値によって、γ星人のセリフを分岐
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}