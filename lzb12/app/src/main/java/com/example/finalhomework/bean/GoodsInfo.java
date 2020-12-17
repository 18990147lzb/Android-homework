package com.example.finalhomework.bean;

import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "树蝰", "二西莫夫", "黑色魅影", "冲出突围", "野火", "永恒之枪","巨龙传说","暴怒野兽"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
            "黑色案底上手绘了一条富有冲击力的蓝色树蝰. 危险的事固然美丽",
            "这把武器使用科幻设计进行了自定义涂装。 平凡人预测未来… 梦想家塑造未来",
            "It has been custom painted with two stylized blue-magenta women over a grayscale background. \"They took comfort in each other's despair",
            "枪身描绘了变异老鼠试图逃离受到辐射的荧光绿色森林。 谁想尝尝当小白鼠的滋味……",
            "这把武器使用了自定义涂装。通体黑红的枪底上喷涂着野火大行动图标的手绘。 枪打出头鸟！",
            "奥丁的长矛附身到这把珠光宝气，通体天蓝的象牙制AWP上。 众神之父的武器",
            "这把武器使用凯尔特龙的图案进行了自定义涂装。 200 把钥匙绝对无法解开它的秘密",
            "这把武器使用残忍的生物的图案，搭配迷幻的颜色进行了涂装。 你真的的想给我留下深刻的印象吗布兹？用刺眼的黑光证明给我看吧 - 明日之星罗纳.萨布里"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {70, 380, 185, 2999, 990, 60000,100000,4990};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.kdlk_s, R.drawable.bk6_s, R.drawable.bk7_s,
            R.drawable.ktz_s, R.drawable.pst_s, R.drawable.xflcx_s, R.drawable.huia_s,R.drawable.tgl_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.kdlk, R.drawable.bk6, R.drawable.bk7,
            R.drawable.ktz, R.drawable.pst, R.drawable.xflcx,
            R.drawable.huia, R.drawable.tgl
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
