package com.example.classicalmusicquisapp;

// QuizData.java
import java.util.ArrayList;
import java.util.Collections;

public class QuizData {
    public static ArrayList<Quiz> getQuizzes() {
        ArrayList<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz(

                "ベートーヴェンの交響曲第5番は一般的に何と呼ばれていますか？",
                new String[]{"運命", "英雄", "田園", "合唱"},
                new boolean[]{true, false, false, false},
                "交響曲第5番は「運命」として知られています。",
                0

        ));
        quizzes.add(new Quiz(
                "次の中でモーツァルトの交響曲の副題はどれでしょう？",
                new String[]{"時計", "ハフナー", "田園", "V字"},
                new boolean[]{false, true, false, false},
                "正解はハフナー[交響曲第35番 ニ長調 K.385]です。",
                0

        ));
        quizzes.add(new Quiz(
                "次の中でマーラーの交響曲の副題はどれでしょう？",
                new String[]{"狩", "田園", "帝国", "巨人"},
                new boolean[]{false, false, false, true},
                "正解は巨人[交響曲第1番 第1稿の初演は1889年11月20日]です。",
                0

        ));
        quizzes.add(new Quiz(
                "次の中でブルックナーの交響曲の副題はどれでしょう？",
                new String[]{"ロマンティック", "奇蹟", "悲劇的", "驚愕"},
                new boolean[]{true, false, false, false},
                "正解はロマンティック[交響曲第4番 1874年稿の初演は1975年9月20日]です。",
                0

        ));
        quizzes.add(new Quiz(
                "実在するクラシック音楽の作品は？",
                new String[]{"ビール", "バーボン", "ワイン", "ウィスキー"},
                new boolean[]{false, false, true, false},
                "正解はワインでオーストリアの作曲家[アルバン・ベルク]によって作曲された曲です。",
                0

        ));
        quizzes.add(new Quiz(
                "バリトンのフィッシャー=ディースカウ最後の弟子の名前はある果物の名前が付きますがそれは何？",
                new String[]{"レモン", "アップル", "パイン", "グレープ"},
                new boolean[]{false, true, false, false},
                "正解はアップルでドイツの歌手[ベンヤミン・アップル]です。",
                0


        ));
        quizzes.add(new Quiz(
                "この中でフランスの作曲家オベール作曲した作品はどれでしょう？",
                new String[]{"白いドミノ", "黒いドミノ", "赤いドミノ", "青いドミノ"},
                new boolean[]{false, true, false, false},
                "正解は[黒いドミノ]で全3幕のオペラ・コミックスです。",
                0

        ));
        quizzes.add(new Quiz(
                "シューベルトが作曲したピアノ五重奏曲の愛称にはある魚の名前が付きますが、それは何でしょう？",
                new String[]{"鱒", "秋刀魚", "鯵", "鮪"},
                new boolean[]{true, false, false, false},
                "正解は[鱒]でシューベルトの代表曲です。",
                0

        ));
        quizzes.add(new Quiz(
                "次の中でハンガリー舞曲の作曲家は誰でしょう？",
                new String[]{"シューマン", "メンデルスゾーン", "ブラームス", "ベートーヴェン"},
                new boolean[]{false, false, true, false},
                "正解は[ブラームス]で全21曲の作品で、アバド・VPOの演奏がオススメです。",
                0

                //9













        ));
        quizzes.add(new Quiz(
                "次の中でロシア5人組のメンバーは誰ですか?",
                new String[]{"ラフマニノフ", "ムソルグスキー", "R.コルサコフ", "シュニトケ"},
                new boolean[]{false, true, true, false},
                "正解はムソルグスキーとR.コルサコフで、他メンバーはキュイとバラキレフ、ボロディンです。",
                1

        ));
        quizzes.add(new Quiz(
                "バロック音楽の作曲家をすべて選んでください。",
                new String[]{"バッハ", "モーツァルト", "ヘンデル", "ベートーヴェン"},
                new boolean[]{true, false, true, false},
                "バッハとヘンデルはバロック時代の作曲家です。",
                1

        ));
        quizzes.add(new Quiz(
                "次の中でベルリン・フィルの主席指揮者をすべて選んでください。",
                new String[]{"マゼール", "カラヤン", "ラトル", "ショルティ"},
                new boolean[]{false, true, true, false},
                "カラヤンが1955年、ラトルが2002年に主席指揮者になりました。",
                1


        ));
        quizzes.add(new Quiz(
                "次の中でハイドンの交響曲の副題ををすべて選んでください。",
                new String[]{"うっかり者", "マリア・テレジア", "熊", "校長先生"},
                new boolean[]{true, true, true, true},
                "正解は全部です。他にはホルン信号や哲学者等があります。",
                1


        ));
        quizzes.add(new Quiz(
                "次の中で[ペレアスとメリザンド]の作曲家をすべて選んでください。",
                new String[]{"ドビュッシー", "シェーンベルク", "フォーレ", "シベリウス"},
                new boolean[]{true, true, true, true},
                "正解は全員です。4人の作曲家が同じ名前の作品を作曲するのは稀です。",
                1

        ));
        quizzes.add(new Quiz(
                "次の中でショパンの[練習曲]の副題をすべて選んでください。",
                new String[]{"革命", "滝", "騎手", "パガニーニ"},
                new boolean[]{true, true, true, true},
                "正解は全部で、どの曲も超絶技巧が要求される難曲です。",
                1

        ));
        quizzes.add(new Quiz(
                "次の中でショスタコーヴィチの交響曲の副題はどれでしょう？",
                new String[]{"革命", "不滅", "レニングラード", "田園"},
                new boolean[]{true, false, true, false},
                "正解は[5番 革命と7番 レニングラード]で、彼は大のサッカー好きで審判の" +
                        "免許を持っていました。",
                1

        ));
        quizzes.add(new Quiz(
                "次の中でブルックナーの交響曲の副題はどれでしょう？",
                new String[]{"ロマンティック", "奇蹟", "悲劇的", "驚愕"},
                new boolean[]{true, false, false, false},
                "正解はロマンティック[交響曲第4番 1874年稿の初演は1975年9月20日]です。",
                1

        ));
        quizzes.add(new Quiz(
                "次の中でマーラーの交響曲の副題はどれでしょう？",
                new String[]{"1000人の交響曲", "バビ・ヤール", "おもちゃの交響曲", "典礼風"},
                new boolean[]{true, false, false, false},
                "[正解は交響曲第8番 1000人の交響曲]で初演時1030人で演奏されました。。",
                1


                         //9



                     //16
        ));
        quizzes.add(new Quiz(
                "ハイドンが作曲した交響曲の数は60 〇か✘か？",
                new String[]{"〇", "✘"},
                new boolean[]{false, true},
                "ハイドンが作曲した交響曲は104曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "レイフ・セーゲルスタムが作曲した交響曲の数は300曲以上 〇か✘か？",
                new String[]{"〇", "✘"},
                new boolean[]{true, false},
                "フィンランドの作曲家兼指揮者のセーゲルスタムは交響曲だけで343曲あります。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で無音の曲はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new boolean[]{true, false},
                "アメリカの作曲家 [ジョン・ケージ]が作曲した4分33秒です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲でティンパニ奏者がティンパニの中で突っ込む曲はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "アルゼンチンの作曲家 [マウリシオ・カーゲル]が作曲したティンパニ協奏曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で走行中のヘリで演奏される曲は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "ドイツの作曲家 [シュトックハウゼン]が作曲した[ヘリコプター弦楽四重奏曲]です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で[膀胱結石手術図]は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "フランスの作曲家 [マラン・マレ]の麻酔無しの手術の痛々しい実体験から生まれた作品です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で演奏中にソリストがどんどん居なくなる曲はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "ハイドンの交響曲第45番 嬰ヘ短調[告別]です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で[干からびた胎児]は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "フランスの作曲家 [エリック・サティ]が作曲した奇抜なタイトルのピアノ曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で100台のメトロノームによって演奏される曲はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "ルーマニアの作曲家 [リゲティ・ジェルジュ]が作曲した[ポエム・サンフォニック]です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で鍵盤を使わずに演奏されるピアノ曲はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "アメリカの作曲家 [ヘンリー・カウエル]が作曲した[The Banshee]です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で演奏が終わるのに639年掛かる曲は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "アメリカの作曲家 [ジョン・ケージ]が作曲した[organ 2/As slow As Possible]オルガン曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で[白鳥を焼く男]はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "ドイツの作曲家 [パウル・ヒンデミット]が作曲したヴィオラ協奏曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で[朝7時に湯治場で二流のオーケストラによって初見で演奏された「さまよえるオランダ人」序曲]は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "ドイツの作曲家 [パウル・ヒンデミット]が作曲したタイトル名が長過ぎる弦楽四重奏曲です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で猫の鳴き声で歌われる曲は無い 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{false, true},
                "伝ロッシーニの[猫の二重唱]です。",
                2

        ));
        quizzes.add(new Quiz(
                "クラシック音楽の曲で[ホイップ・クリーム]はある 〇か✘か？",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "ドイツの作曲家[R.シュトラウス]が作曲したバレエ組曲です。",
                2


        ));
        quizzes.add(new Quiz(
                "クラシック音楽の作品で掃除機で音を出すソリストが銃で撃たれる作品はある 〇か✘か? ",
                new String[]{"〇", "✘"},
                new  boolean[]{true, false},
                "イギリスの作曲家マルコム・アーノルドが作曲した A Grand, Grand Overtureです。",
                2





                /*
        ));
        quizzes.add(new Quiz(
                "今流れているロッシーニの序曲は何でしょう？",
                new String[]{"ウィリアムテル", "絹のはしご", "セミラーミデ", "泥棒カササギ"},
                new boolean[]{true, false, false, false},
                "正解はハフナー[正解はウィリアムテルです。]です。",
                3

                 */














        ));
        Collections.shuffle(quizzes);
        return new ArrayList<>(quizzes.subList(0, 10)); // ランダムな10問
    }
}
