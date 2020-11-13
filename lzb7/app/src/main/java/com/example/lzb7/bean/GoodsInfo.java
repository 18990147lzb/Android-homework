package com.example.lzb7.bean;

import com.example.lzb7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "巨龙传说", "永恒之枪", "暴怒野兽", "冲出重围", "野火", "二西莫夫","黑色魅影","树蝰 "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
            "这把武器使用凯尔特龙的图案进行了自定义涂装。 200 把钥匙绝对无法解开它的秘密",
            "奥丁的长矛附身到这把珠光宝气，通体天蓝的象牙制AWP上。 众神之父的武器",
            "这把武器使用残忍的生物的图案，搭配迷幻的颜色进行了涂装。 你真的的想给我留下深刻的印象吗布兹？用刺眼的黑光证明给我看吧 - 明日之星罗纳.萨布里",
            "枪身描绘了变异老鼠试图逃离受到辐射的荧光绿色森林。 谁想尝尝当小白鼠的滋味……",
            "这把武器使用了自定义涂装。通体黑红的枪底上喷涂着野火大行动图标的手绘。 枪打出头鸟！",
            "这把武器使用科幻设计进行了自定义涂装。 平凡人预测未来… 梦想家塑造未来",
            "It has been custom painted with two stylized blue-magenta women over a grayscale background. \"They took comfort in each other's despair",
            "黑色案底上手绘了一条富有冲击力的蓝色树蝰. 危险的事固然美丽"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {100000, 60000, 4990, 2990, 990, 380,185,70};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.longju_s, R.drawable.youheng_s, R.drawable.yeshou_s,
            R.drawable.tuwei_s, R.drawable.yehuo_s, R.drawable.erxi_s, R.drawable.heimei_s,R.drawable.shukui_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.longju, R.drawable.youheng, R.drawable.yeshou,
            R.drawable.tuwei, R.drawable.yehuo, R.drawable.erxi,
            R.drawable.heimei, R.drawable.shukui
    };

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
}
