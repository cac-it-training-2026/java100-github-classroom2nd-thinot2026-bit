package lesson08.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 高性能調理ロボットクラス
class SuperRobotChef {

	// 豪華な料理を作成するメソッド
	// 引数として、和牛、キャビア、トリュフのグラム数を受け取ります
	public String makeLuxuriousDish(int wagyu, int caviar, int truffle) {
		String menu = null;

		// 1. 最上級の豪華料理（和牛200g、キャビア50g、トリュフ30g以上）
		if (wagyu >= 200 && caviar >= 50 && truffle >= 30) {
			menu = "「極上A5和牛ステーキ 〜キャビアとトリュフの贅沢添え〜」";
		}
		// 2. 肉メインの豪華料理（和牛150g、トリュフ10g以上）
		else if (wagyu >= 150 && truffle >= 10) {
			menu = "「厚切り和牛のトリュフソースがけ」";
		}
		// 3.（キャビア30g以上）
		else if (caviar >= 30) {
			menu = "「キャビア軍艦」";
		}
		// 4. 足りなかった場合
		else if (wagyu > 0 || caviar > 0 || truffle > 0) {
			menu = "「高級食材のカケラを添えた、高級卵かけご飯」";
		}
		// 5. 何も具材がない場合
		else {
			menu = "「普通の卵かけご飯」";
		}

		return menu;
	}
}

// 実行用のメインクラス
public class SuperRobot {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ユーザーから高級食材の量を入力してもらう
		System.out.print("\n和牛の量を入力してください（グラム）＞");
		int wagyu = Integer.parseInt(br.readLine());

		System.out.print("キャビアの量を入力してください（グラム）＞");
		int caviar = Integer.parseInt(br.readLine());

		System.out.print("トリュフの量を入力してください（グラム）＞");
		int truffle = Integer.parseInt(br.readLine());

		// 1. SuperRobotChefクラスのインスタンスを生成
		SuperRobotChef chefRobot = new SuperRobotChef();

		// 2. 豪華な料理を作成
		String dish = chefRobot.makeLuxuriousDish(wagyu, caviar, truffle);

		System.out.println("\nSuperRobot：");
		System.out.println("調理が完了しました。");
		System.out.println("本日のディナー、" + dish + " でございます。\n");
	}
}