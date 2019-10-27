package xyz.intellij.bkop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private ListView Lv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        setFullscreen();
//        setTheme(R.style.SplashTheme);
//
//        delay(5000);
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lv = (ListView) findViewById(R.id.Lv);

        final String[] name = new String[] { "安殿保", "白色脸谱", "柴桂", "黑色脸谱",
                "红色脸谱", "黄色脸谱", "蓝色脸谱", "绿色脸谱", "时迁", "紫色脸谱" };
        final String[] message = new String[] {
                "安殿宝，古典小说《说唐后传》中的人物，武功盖世，奉盖舒闻之命把守独木关。\n" +
                        "唐军杀到独木关，\n" +
                        "薛仁贵患病，\n" +
                        "周青出战，斩杀了安殿宝的副将蓝天碧和蓝天象。安殿宝亲自出战，八大火头军围攻安殿宝，四十个回合之后，八个火头军杀得眼目昏花，汗流脊背，但竟还不是安殿宝的对手。\n" +
                        "薛仁贵闻讯，带病上阵，安殿宝询问来将姓名，薛仁贵头晕脑胀，没有理会，径直冲了过去。惊动了虚空\n" +
                        "九天玄女娘娘，见仁贵带病出马，遂传法旨，\n" +
                        "叫左首青衣小童仗剑，去帮薛礼取胜安殿宝……\n" +
                        "玄女保护童子，拿他戟尖刺入番将咽喉。这安殿宝不防备的，要架也来不及，喊得一声：“阿呀！”人已穿在戟尖上了。\n",
                "白色有粉白和油白之分。京剧中常常用白色脸谱来表现奸邪的反面角色，如三国戏中的奸雄曹操画粉白脸，表明其奸诈多疑。此外，鹤发童颜的老英雄、将官以及和尚、太监等角色也可以画白色脸谱。\n" +
                        "\n",
                "柴桂\n" +
                        "柴桂是《说岳全传》中的人物，为世袭梁王，善用金刀，本领过人，嫉贤妒能，利欲熏心。\n" +
                        "柴桂是《\n" +
                        "\t说岳全传》中的人物，为世袭\n" +
                        "\t梁王，后周世宗\n" +
                        "\t柴荣嫡系子孙，善用金刀，本领过人，嫉贤妒能，利欲熏心。经过太行山被贼首\n" +
                        "\t王善诱惑，意图谋反作乱，入京抢夺状元，丞相\n" +
                        "\t张邦昌、兵部尚书王铎、右军都督\n" +
                        "\t张俊三位考官下了重贿，希望结识天下举子，内外勾结，反叛大宋。\n" +
                        "\t岳飞为了求取功名，约上结拜兄弟\n" +
                        "\t牛皋、\n" +
                        "王贵、汤怀，张显四人，一同投京城汴梁（今开封）应考。这届武考的高潮便是岳飞与柴桂的交锋。两人先比试文才，张邦昌命岳飞作“枪论”；小梁王作“刀论”。岳飞妙笔生花，即刻而就；而小梁王心慌意乱，先将“刀论”写成“力论”，又左涂右改，胡乱交卷，自然比不上岳飞。接着比射箭，张邦昌怕 岳飞再赢，便暗中差人将箭靶移至二百步以外，可岳飞并不慌张，只见他弓开如满月，箭去似流星，一连九发，枝枝从靶心穿过。全场无不震惊，吓得小梁王也不敢比弓法了。最后，只剩下马上比武。论武艺，小梁王根本不是岳飞的对手，可此时岳飞心里十分犯难：那小梁王乃是贵胄，自己不过是一区区武生。比武场上，枪来刀往，万一失手，如何担待得起。因此，场上两骑相遇，小梁王左杀右砍，好不威风，而岳飞只是招架，并不还手。几个回合后，岳飞突然跳出阵来，奔到监考台前，要求立下“生死文书”，不论那个伤了性命，都不要偿命。张邦昌见岳飞刚才只有招架之功，并无还手之力，以为他必胜不得小梁王，便一口答应下来。二人立下“生死文书”，重又披挂上马，雄赳赳，气昂昂，你砍我刺，互不相让，好一场厮杀！岳飞心中没了顾忌，越发精神抖擞，一杆沥泉枪舞得似风卷梨花，坐骑白鬃马冲突迂回若白龙戏水，只杀得小梁王闪闪躲躲，全没了刚才的神气。忽然，岳飞虚晃一枪，反手直刺小梁王的心窝，不待小梁王遮挡一下，人早已被岳飞挑下马来，结果了性命。这一下，全场高声喝采，惟独吓坏了张邦昌等几个奸臣，他们气急败坏，立即命手下兵将把岳飞抓来，要斩首偿命。宗泽看到这一切，勃然大怒，叱退了刀斧手，定要保全岳飞性命。两边争执不下，可考场已乱了营，考生们见主考如此无理，齐声喊冤，大叫造反，吓得张邦昌也 没了主意。正在这时，只见牛皋怒目圆睁，挥舞双锏杀进校场，举手一锏便将场中央那杆标志大宋威严的巨纛砍倒，全场顿时大乱。张邦昌知道在这种情况下，如果还不放了岳飞，自己的性命可就保不住了，急忙命人为岳飞松绑。岳飞转身跳上白鬃马，与四兄弟砍开校场大门，往城外奔去。",
                "黑色：黑色最初也是用来表示人物肤色的，包公画黑脸表明他的皮肤黑，随着包拯铁面无私的公正形象备受推崇，黑色就符号化为一种性格的表征，经过延伸后，黑色脸谱一般用于正直无私，刚正不阿以及性格直爽刚毅而勇猛的人物。\n" ,
                "红色一般用来表示耿直、忠义，有血性，多表现正面角色。其实，红色脸谱最初只是为了表明人物的肤色，而很多肤色红黑的角色都非常忠勇、正直，这样推而广之，就开始用红色表忠勇，并为忠勇良将、有道神仙勾画红色脸谱。",
                "在京剧脸谱中，用黄色寓意人物骁勇彪悍或凶暴残忍，所以黄色脸谱一般用于勇猛而暴躁的人物。",
                "在京剧脸谱中，蓝色与绿色的含义相近，都是黑色的延伸，表示人物性格刚强、豪爽，有时候也表示人物的阴险、狡猾。\n" +
                        "\n",
                "在京剧脸谱中，绿色脸谱一般用来表示勇猛、莽撞、暴躁的人物，与黑色脸谱有相近的用意。此外，有些占山为王的草寇类人物也勾画绿色脸谱。",
                "时迁是《\n" +
                        "\t水浒传》中的人物，绰号\n" +
                        "\t鼓上蚤，高唐州人氏，出身盗贼，在与杨雄、石秀投奔梁山途中，因偷鸡被祝家庄活捉，引出梁山\n" +
                        "\t三打祝家庄。他曾到东京盗取雁翎金圈甲，赚取徐宁上梁山，并在梁山攻破大名府、曾头市的战役中立下大功。梁山大聚义时，排第一百零七位，上应“\n" +
                        "\t地贼星”，担任走报机密步军头领。征方腊后病死于杭州，追封义节郎\n" +
                        "人物出身\n" +
                        "时迁是高唐州人氏，以偷盗为业，甚至偷坟盗墓，善能飞檐走壁，人称鼓上蚤，他曾在蓟州府惹下官司，被蓟州两院押狱杨雄救下。\n",
                "紫色是红色和黑色的中间色，其表示的象征意义也介于红黑之间，一般表示肃穆稳重，刚正威严，富有正义感。有的人物在小说、戏剧中描写为紫色脸膛，所以就给他们画紫色脸谱，也有的人物勾画紫脸是为了表示他的相貌丑陋。"
        };
        final int[] photo = new int[] { R.drawable.andianbao, R.drawable.baise, R.drawable.chaigui, R.drawable.heise, R.drawable.hongse, R.drawable.huangse, R.drawable.lanse, R.drawable.lvse, R.drawable.shiqian, R.drawable.zise};
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        String name1;
        int pic;
        String content;
        for (int i=0;i<name.length;i++){

            Map<String, Object> map1 = new HashMap<String, Object>();
            map1.put("photo",photo[i]);
            map1.put("name", name[i]);
            data.add(map1);
        }
//        Map<String, Object> map1 = new HashMap<String, Object>();
//        map1.put("photo", R.drawable.andianbao);
//        map1.put("name", name[0]);
//        data.add(map1);
//
//        Map<String, Object> map2 = new HashMap<String, Object>();
//        map2.put("photo", R.drawable.baise);
//        map2.put("name", name[1]);
//        data.add(map2);
//
//        Map<String, Object> map3 = new HashMap<String, Object>();
//        map3.put("photo", R.drawable.chaigui);
//        map3.put("name", name[2]);
//        data.add(map3);

        Lv.setAdapter(new SimpleAdapter(this, data, R.layout.item,new String[] { "photo", "name" }, new int[] { R.id.iv,R.id.tv_name }));
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                Bundle bundle = new Bundle();
                bundle.putInt("photo", photo[arg2]);
                bundle.putString("message", message[arg2]);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(MainActivity.this, DetailsActivity.class);
                Log.i("message", message[arg2]);
                startActivity(intent);
            }
        });

    }
    private void delay(int ms){
        try {
            Thread.currentThread();
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setFullscreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
