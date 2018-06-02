package com.star.controller;

import java.util.HashMap;
import java.util.Map;

import com.star.model.CommonContent;
import com.star.model.Room;

public class RoomManagement {
	public static Map<String, Room> cityMap = new HashMap<String, Room>();
	
	

	public static void creatRooms() {
		/*扬州*/
		Room room_guangchang = new Room();	
		room_guangchang.setRoomId("yangzhou_guangchang");
		room_guangchang.SetRoomName("扬州广场");
		room_guangchang.setDescription(" 这里是城市的正中心，一个很宽阔的广场，铺着青石地面。一些游手好闲的人在这里溜溜达达，经常有艺人在这里表演。你可以看到东边和南边是几家大的店铺，来自全国各地的行人来来往往，西面是扬州戌守兵营，而北边则是扬州巡抚衙门的所在。广场中央有一棵老桃树(tree)，显得十分的粗壮，树上的树叶(leaf)非常茂密，有几只不知名的小鸟在其中窜来窜去。大树旁边有一块新立的牌子(sign)");
		
		//北大街
		Room room_beidajie1 = new Room();
		room_beidajie1.setRoomId("yangzhou_beidajie1");
		room_beidajie1.SetRoomName("北大街");
		room_beidajie1.setDescription("你走在一条繁忙的街道上，看着操着南腔北调的人们行色匆匆，许多人都往南边走去，那里通向一个热闹的广场。东边是一家生意兴隆的宝昌客栈，来自各地的人们进进出出。西边是扬州一家老字号的钱庄，名为天阁斋。可以听到叮叮当当的金银声音。");
		
		Room room_beidajie2 = new Room();
		room_beidajie2.setRoomId("yangzhou_beidajie2");
		room_beidajie2.SetRoomName("北大街");
		room_beidajie2.setDescription("你走在一条繁忙的街道上，东边是扬州驿站，来自京城的快马有时会急驶而入，片刻后又会有另一匹快马从里面冲出来绝尘而去，南边是一家大店铺，门前的绣金旗子上写着一个斗大的“当”字，仔细倾听，可以听到压低的讨价还价的声音。");
		
		Room room_beidajie3 = new Room();
		room_beidajie3.setRoomId("yangzhou_beidajie3");
		room_beidajie3.SetRoomName("北大街");
		room_beidajie3.setDescription("这是一条宽阔的青石街道，向南北两头延伸。北边是北城门通向城外。南边显得很繁忙。东边是一家小吃店，店面窄小，恐怕只供应外卖。西边就是城隍庙。");
		
		Room room_beimen = new Room();
		room_beimen.setRoomId("yangzhou_beimen");
		room_beimen.SetRoomName("北门");
		room_beimen.setDescription("这是就是扬州城的北城门了，城门口一队队官兵正在盘查过往的百姓，一个手持长剑身穿铁甲武将正在门口巡视，近些时候因为江南一带的贩私盐愈演愈烈，所以朝廷以办事不利的罪名撤消了程要发的官职，上京问斩了，派了一位新的巡抚大人，弄的现在人心惶惶，谁都不敢在城门久留。城门的墙上张贴着一纸告示(gaoshi)。");
		
		Room room_qianzhuang = new Room();
		room_qianzhuang.setRoomId("yangzhou_qianzhuang");
		room_qianzhuang.SetRoomName("天阁斋");
		room_qianzhuang.setDescription("这是一家老字号的钱庄，已有几百年的历史，在全国各地都有分店。它发行的银票信誉非常好，通行全国。");
		
		Room room_kezhan = new Room();
		room_kezhan.setRoomId("yangzhou_kezhan");
		room_kezhan.SetRoomName("宝昌客栈");
		room_kezhan.setDescription("这里是生意兴隆的宝昌客栈，附近的外地游客多选择在此落脚。一个年轻的店小二里里外外忙得团团转，接待着南腔北调的客人。客栈北面的墙上挂着一块醒目的招牌(zhaopai)，南面的墙上挂有一张作废过期的告示(gaoshi)。");
		
		Room room_yizhan = new Room();
		room_yizhan.setRoomId("yangzhou_yizhan");
		room_yizhan.SetRoomName("驿站");
		room_yizhan.setDescription("这是扬州驿站，负责传送和京城里的往来公文。每天快马三匹，早午晚各传递书信三次。不管你的书信要寄到哪里，只要放到这里，一天之内绝对可以送到，北边是一家新开的花店，据说里面的老板非常漂亮。");
		
		Room room_dangpu = new Room();
		room_dangpu.setRoomId("yangzhou_dangpu");
		room_dangpu.SetRoomName("当铺");
		room_dangpu.setDescription("这是一家素以买卖公平著称的老字号当铺，一个四尺高的柜台摆在你的面前，柜台上摆着一个牌子(paizi)， 柜台后坐着当铺的老板，一双鬼溜溜的眼睛上上下下打量着你.");
		
		Room room_chmiao = new Room();
		room_chmiao.setRoomId("yangzhou_chmiao");
		room_chmiao.SetRoomName("城隍庙");
		room_chmiao.setDescription(" 这是扬州城北的城隍庙。庙里平日香客稀少，赶上中秋节、端午节或者庙会的时候，才会有些香火。堂中放着一个城隍的塑像，上面落满了灰尘，墙角里有个破蜘蛛网，两只蜘蛛无聊地蹲在上面。");
		
		Room room_xiaochidian = new Room();
		room_xiaochidian.setRoomId("yangzhou_xiaochidian");
		room_xiaochidian.SetRoomName("小吃店");
		room_xiaochidian.setDescription("这是一家小店，生意倒是挺兴隆的，座位坐得满满的，还有些人在站着等座。看来多等也是无益，不如买点包子、鸡腿、烤鸭、米酒赶路吧。");
		
		
		//南大街
		Room room_nandajie1 = new Room();
		room_nandajie1.setRoomId("yangzhou_nandajie1");
		room_nandajie1.SetRoomName("南大街");
		room_nandajie1.setDescription("南大街乃是扬州城里的繁华地段，一到晚上，一派灯红酒绿，尤为热闹。笑声、歌声、琴声、箫声，汇成一片送入了你的耳朵，你不禁心猿意马，很想就此停步享受一番。北边是一个热闹的广场。西边是一片喧嚣，夹杂着“一五一十”的数钱声，原来那里是方圆千里之内最大的一家赌场");
		
		Room room_nandajie2 = new Room();
		room_nandajie2.setRoomId("yangzhou_nandajie2");
		room_nandajie2.SetRoomName("南大街");
		room_nandajie2.setDescription("你走在一条繁华的街道上，向南北两头延伸。南边是几座园林，北边通往市中心，西边是一家顾客众多的茶馆，三教九流人士都在那里谈天说地。东边则是官府特设的扬州盐局。");
		
		Room room_nandajie3 = new Room();
		room_nandajie3.setRoomId("yangzhou_nandajie3");
		room_nandajie3.SetRoomName("南大街");
		room_nandajie3.setDescription("你走在一条繁华的街道上，向南北两头延伸。南边是南城门，北边通往市中心，东西两边各是一座小园子");
		
		Room room_nanmen = new Room();
		room_nanmen.setRoomId("yangzhou_nanmen");
		room_nanmen.SetRoomName("南门");
		room_nanmen.setDescription("这是扬州的南城门，城墙上贴着一张官府的告示(gaoshi)。扬州是淮盐的集散地，往来的盐贩子很多，几个官兵正在认真地检查过往的行人，查看他们是否携带有私盐。南边的青石大道可以一直通到远处长江北岸的码头。");
		
		Room room_duchang = new Room();
		room_duchang.setRoomId("yangzhou_duchang");
		room_duchang.SetRoomName("赌场");
		room_duchang.setDescription("这里是赌场的大堂，四周的房间里传出来吆五喝六的赌博声，北边是赌「大小」的房间，西面是赌「牌九」的房间，楼上的拱猪房灯火通明。");
		
		Room room_bingying = new Room();
		room_bingying.setRoomId("yangzhou_bingying");
		room_bingying.SetRoomName("兵营");
		room_bingying.setDescription("这里是兵营，密密麻麻到处都是官兵，有的在武将的指挥下列队操练，有的独自在练功，有的坐着、躺着正在休息。南墙下坐着主帅，不动声色地寻视着四周。看到你进来，他们全都向你包围了过来，形势看来不太妙。西边有一个小窗口(window)。为了方便探监的百姓，可以从这个窗口传递(pass)些吃的东西。");
		
		Room room_chaguan = new Room();
		room_chaguan.setRoomId("yangzhou_chaguan");
		room_chaguan.SetRoomName("茶馆");
		room_chaguan.setDescription("这是扬州城南的一家茶馆。一走进来，就闻到一股茶香沁入心脾，你的精神为之一爽。几张八仙桌一字排开，坐满了客人，或高声谈笑，或交头接耳。壁上挂了一幅字贴(zitie) 。茶馆中有一说书之人，讲述三国志、水浒传、大明英烈传等等英雄故事。茶博士正在吆喝着招呼客人, 递茶送水, 忙的不亦乐乎。");
		
		Room room_yanju = new Room();
		room_yanju.setRoomId("yangzhou_yanju");
		room_yanju.SetRoomName("盐局");
		room_yanju.setDescription("你来到一座结构宏伟的建筑前，左右石坛上各插着一根两丈多高的旗杆，杆上锦旗飘扬。左首旗子上写着“扬州盐局”四个黑字，银钩铁划，端的是刚劲非凡。扬州一带是江北淮盐的集散之地，官府为了便于管理, 征得盐税, 特设了扬州盐局, 直接听命于朝廷。入口处有一堆盐商在说笑，墙角堆着一堆石灰粉，旁边放着个布袋。");
		
		Room room_geyuan = new Room();
		room_geyuan.setRoomId("yangzhou_geyuan");
		room_geyuan.SetRoomName("个园");
		room_geyuan.setDescription("据传这里是盐商黄应泰修建。园内种竹千杆，因竹叶形如“个”字，故以是名。入园门左转至复道廊，迎面花坛种竹，竹间立石笋。北面园门上有“个园”题字石额。园门向北为桂花厅，前植桂树，后凿水池，六角攒尖式小亭隔水相望。延北墙是湖石假山，山上古松，山下趋桥流水。夏日晴雨，水中倒影多变，有下山之称。");
		
		Room room_xiaopangu = new Room();
		room_xiaopangu.setRoomId("yangzhou_xiaopangu");
		room_xiaopangu.SetRoomName("小盘古");
		room_xiaopangu.setDescription("小盘古是扬州一座著名的小庭院。园内以湖石假山为主，山下有曲洞，绕洞而行，进入一条回廊，尽头紧接着山谷。山峰下，水池上，凌空架一石梁，通向水阁凉亭。");
		
		
		//西大街
		Room room_xidajie1 = new Room();
		room_xidajie1.setRoomId("yangzhou_xidajie1");
		room_xidajie1.SetRoomName("西大街");
		room_xidajie1.setDescription("这是一条宽阔的青石板街道，向东西两头延伸。北边是一片青色的楼房，隐约传来阵阵的浪笑，那就是天下闻名的鸣玉坊。这里往东面走是一个热闹的广场。");
//		
//		Room room_xidajie2 = new Room();
//		room_xidajie2.setRoomId("yangzhou_xidajie2");
//		room_xidajie2.SetRoomName("西大街");
//		room_xidajie2.setDescription("这是一条宽阔的青石板街道，向东西两头延伸。这里来来往往的游人你推我挤，热闹非常。从东面不时地传来笑语莺歌，声声撩人，而从西边则传来一阵阵的香气。南边是有名的扬州大明寺，北边就是瘦西湖边了。");
//		
//		Room room_xidajie3 = new Room();
//		room_xidajie3.setRoomId("yangzhou_xidajie3");
//		room_xidajie3.SetRoomName("西大街");
//		room_xidajie3.setDescription("你走在西大街上，感到这里的街面要比别处的干净、整洁。街上的行人比以前也多了许多，东面是扬州的著名风景“瘦西湖”，西边是西城门。南边是一家已经关门了的珠宝店，而北边则是一座已经打烊了的大酒楼，挂着一幅招帘，门额上悬挂一方横匾，黑暗之中看不太清匾上的字迹。");
//		
//		Room room_ximen = new Room();
//		room_ximen.setRoomId("yangzhou_ximen");
//		room_ximen.SetRoomName("西门");
//		room_ximen.setDescription("这是西城门，城墙上贴着几张通缉告示(gaoshi)。西门是往西域的必经之地，官兵们戒备森严。一条笔直的青石板大道向东西两边延伸。西边是郊外，骑马的、坐轿的、走路的，行人匆匆。东边是城里的西大街。");
		//东大街
		Room room_dongdajie1 = new Room();
		room_dongdajie1.setRoomId("yangzhou_dongdajie1");
		room_dongdajie1.SetRoomName("东大街");
		room_dongdajie1.setDescription(" 这是一条宽阔的青石板街道，向东西两头延伸。东边不时地传来朗朗的书声，西边是一个热闹的广场，南边则是一家古香古色的店铺，里边不时传出用乐器吹奏的曲调。");
		
//		Room room_dongdajie2 = new Room();
//		room_dongdajie2.setRoomId("yangzhou_dongdajie2");
//		room_dongdajie2.SetRoomName("东大街");
//		room_dongdajie2.setDescription("这是一条宽阔的青石板街道，向东西两头延伸。东边不时地传来金属撞击声，西边人声嘈杂。北边是一座简朴的院子，半月形的大门上方写着“白鹿书院”四个烫金大字，苍劲有力。里面不时地传来学生们抑扬顿挫的读书声。南边是一家杂货铺。");
//		
//		Room room_dongdajie3 = new Room();
//		room_dongdajie3.setRoomId("yangzhou_dongdajie3");
//		room_dongdajie3.SetRoomName("东大街");
//		room_dongdajie3.setDescription("你走在东大街上，踩着坚实的青石板地面。东边是打铁铺和武器店，不时传来敲敲打打的金属撞击声，与西边朗朗的读书声混杂在一起。北边是一家老字号的药铺，南边是家寄卖店。");
//		
//		Room room_dongmen = new Room();
//		room_dongmen.setRoomId("yangzhou_dongmen");
//		room_dongmen.SetRoomName("东门");
//		room_dongmen.setDescription("这里是扬州东城门，城门正上方刻着“东门”两个楷书大字，城墙上贴着几张官府的告示(gaoshi)。官兵们警惕地注视着过往行人，通缉犯最好小心为妙。一条笔直的青石板大道向东西两边延伸。东边是郊外，隐约可见一片一望无际的树林，神秘莫测。");
		
		Room nullRoom = new Room(); //此方向没有房间是设置为nullRoom
		nullRoom.setRoomId("nullRoom");
		nullRoom.SetRoomName("一个假装自己存在的房间");
		nullRoom.setDescription("其实房间名字已经描述的很清楚了");
		//建立房间间的链接
		//广场
		room_guangchang.setRoom(CommonContent.DIRECTION.NORTH, room_beidajie1);
		room_guangchang.setRoom(CommonContent.DIRECTION.SOUTH, room_nandajie1);
		room_guangchang.setRoom(CommonContent.DIRECTION.EAST, room_dongdajie1);
		room_guangchang.setRoom(CommonContent.DIRECTION.WEST, room_xidajie1);
		room_guangchang.setRoom(CommonContent.DIRECTION.NORTHEAST, room_kezhan);
		room_guangchang.setRoom(CommonContent.DIRECTION.NORTHWEST, room_qianzhuang);
		room_guangchang.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_bingying);
		room_guangchang.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_duchang);
		room_guangchang.setRoom(CommonContent.DIRECTION.UP, room_beidajie1);
		room_guangchang.setRoom(CommonContent.DIRECTION.DOWN, room_nandajie1);
		//北大街
		room_beidajie1.setRoom(CommonContent.DIRECTION.NORTH, room_beidajie2);
		room_beidajie1.setRoom(CommonContent.DIRECTION.SOUTH, room_guangchang);
		room_beidajie1.setRoom(CommonContent.DIRECTION.EAST, room_kezhan);
		room_beidajie1.setRoom(CommonContent.DIRECTION.WEST, room_qianzhuang);
		room_beidajie1.setRoom(CommonContent.DIRECTION.NORTHEAST, room_yizhan);
		room_beidajie1.setRoom(CommonContent.DIRECTION.NORTHWEST, room_dangpu);
		room_beidajie1.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_dongdajie1);
		room_beidajie1.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_xidajie1);
		room_beidajie1.setRoom(CommonContent.DIRECTION.UP, room_beidajie2);
		room_beidajie1.setRoom(CommonContent.DIRECTION.DOWN, room_guangchang);
		
		room_beidajie2.setRoom(CommonContent.DIRECTION.NORTH, room_beidajie3);
		room_beidajie2.setRoom(CommonContent.DIRECTION.SOUTH, room_beidajie1);
		room_beidajie2.setRoom(CommonContent.DIRECTION.EAST, room_yizhan);
		room_beidajie2.setRoom(CommonContent.DIRECTION.WEST, room_dangpu);
		room_beidajie2.setRoom(CommonContent.DIRECTION.NORTHEAST, room_xiaochidian);
		room_beidajie2.setRoom(CommonContent.DIRECTION.NORTHWEST, room_chmiao);
		room_beidajie2.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_kezhan);
		room_beidajie2.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_qianzhuang);
		room_beidajie2.setRoom(CommonContent.DIRECTION.UP, room_beidajie3);
		room_beidajie2.setRoom(CommonContent.DIRECTION.DOWN, room_beidajie1);
		
		room_beidajie3.setRoom(CommonContent.DIRECTION.NORTH, room_beimen);
		room_beidajie3.setRoom(CommonContent.DIRECTION.SOUTH, room_beidajie2);
		room_beidajie3.setRoom(CommonContent.DIRECTION.EAST, room_xiaochidian);
		room_beidajie3.setRoom(CommonContent.DIRECTION.WEST, room_chmiao);
		room_beidajie3.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_beidajie3.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_beidajie3.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_yizhan);
		room_beidajie3.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_dangpu);
		room_beidajie3.setRoom(CommonContent.DIRECTION.UP, room_beimen);
		room_beidajie3.setRoom(CommonContent.DIRECTION.DOWN, room_beidajie2);
		//北门
		room_beimen.setRoom(CommonContent.DIRECTION.SOUTH, room_beidajie3);
		room_beimen.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.NORTH, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_xiaochidian);
		room_beimen.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_chmiao);
		room_beimen.setRoom(CommonContent.DIRECTION.UP, nullRoom);
		room_beimen.setRoom(CommonContent.DIRECTION.DOWN, room_beidajie3);
		//钱庄
		room_qianzhuang.setRoom(CommonContent.DIRECTION.EAST, room_beidajie1);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.NORTH, room_dangpu);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.SOUTH, room_xidajie1);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.NORTHEAST, room_beidajie2);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_guangchang);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.UP, room_dangpu);
		room_qianzhuang.setRoom(CommonContent.DIRECTION.DOWN, room_xidajie1);
		//客栈
		room_kezhan.setRoom(CommonContent.DIRECTION.WEST, room_beidajie1);
		room_kezhan.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_kezhan.setRoom(CommonContent.DIRECTION.NORTH, room_yizhan);
		room_kezhan.setRoom(CommonContent.DIRECTION.SOUTH, room_dongdajie1);
		room_kezhan.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_kezhan.setRoom(CommonContent.DIRECTION.NORTHWEST, room_beidajie2);
		room_kezhan.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_kezhan.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_guangchang);
		room_kezhan.setRoom(CommonContent.DIRECTION.UP, room_yizhan);
		room_kezhan.setRoom(CommonContent.DIRECTION.DOWN, room_dongdajie1);
		//当铺
		room_dangpu.setRoom(CommonContent.DIRECTION.EAST, room_beidajie2);
		room_dangpu.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_dangpu.setRoom(CommonContent.DIRECTION.NORTH, room_chmiao);
		room_dangpu.setRoom(CommonContent.DIRECTION.SOUTH, room_qianzhuang);
		room_dangpu.setRoom(CommonContent.DIRECTION.NORTHEAST, room_beidajie3);
		room_dangpu.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_dangpu.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_beidajie1);
		room_dangpu.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_dangpu.setRoom(CommonContent.DIRECTION.UP, room_chmiao);
		room_dangpu.setRoom(CommonContent.DIRECTION.DOWN, room_qianzhuang);
		//驿站
		room_yizhan.setRoom(CommonContent.DIRECTION.WEST, room_beidajie2);
		room_yizhan.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_yizhan.setRoom(CommonContent.DIRECTION.NORTH, room_xiaochidian);
		room_yizhan.setRoom(CommonContent.DIRECTION.SOUTH, room_kezhan);
		room_yizhan.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_yizhan.setRoom(CommonContent.DIRECTION.NORTHWEST, room_beidajie3);
		room_yizhan.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_yizhan.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_beidajie1);
		room_yizhan.setRoom(CommonContent.DIRECTION.UP, room_xiaochidian);
		room_yizhan.setRoom(CommonContent.DIRECTION.DOWN, room_kezhan);
		//城庙
		room_chmiao.setRoom(CommonContent.DIRECTION.EAST, room_beidajie3);
		room_chmiao.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_chmiao.setRoom(CommonContent.DIRECTION.NORTH, nullRoom);
		room_chmiao.setRoom(CommonContent.DIRECTION.SOUTH, room_dangpu);
		room_chmiao.setRoom(CommonContent.DIRECTION.NORTHEAST, room_beimen);
		room_chmiao.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_chmiao.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_beidajie2);
		room_chmiao.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_chmiao.setRoom(CommonContent.DIRECTION.UP, nullRoom);
		room_chmiao.setRoom(CommonContent.DIRECTION.DOWN, room_dangpu);
		//小吃店
		room_xiaochidian.setRoom(CommonContent.DIRECTION.WEST, room_beidajie3);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.NORTH, nullRoom);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.SOUTH, room_yizhan);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.NORTHWEST, room_beimen);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_beidajie2);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.UP, nullRoom);
		room_xiaochidian.setRoom(CommonContent.DIRECTION.DOWN, room_yizhan);
		
		//南大街
		room_nandajie1.setRoom(CommonContent.DIRECTION.NORTH, room_guangchang);
		room_nandajie1.setRoom(CommonContent.DIRECTION.SOUTH, room_nandajie2);
		room_nandajie1.setRoom(CommonContent.DIRECTION.WEST, room_duchang);
		room_nandajie1.setRoom(CommonContent.DIRECTION.EAST, room_bingying);
		room_nandajie1.setRoom(CommonContent.DIRECTION.NORTHEAST, room_dongdajie1);
		room_nandajie1.setRoom(CommonContent.DIRECTION.NORTHWEST, room_xidajie1);
		room_nandajie1.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_yanju);
		room_nandajie1.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_chaguan);
		room_nandajie1.setRoom(CommonContent.DIRECTION.UP, room_guangchang);
		room_nandajie1.setRoom(CommonContent.DIRECTION.DOWN, room_nandajie2);
		
		room_nandajie2.setRoom(CommonContent.DIRECTION.NORTH, room_nandajie1);
		room_nandajie2.setRoom(CommonContent.DIRECTION.SOUTH, room_nandajie3);
		room_nandajie2.setRoom(CommonContent.DIRECTION.WEST, room_chaguan);
		room_nandajie2.setRoom(CommonContent.DIRECTION.EAST, room_yanju);
		room_nandajie2.setRoom(CommonContent.DIRECTION.NORTHEAST, room_bingying);
		room_nandajie2.setRoom(CommonContent.DIRECTION.NORTHWEST, room_duchang);
		room_nandajie2.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_xiaopangu);
		room_nandajie2.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_geyuan);
		room_nandajie2.setRoom(CommonContent.DIRECTION.UP, room_nandajie1);
		room_nandajie2.setRoom(CommonContent.DIRECTION.DOWN, room_nandajie3);
		
		room_nandajie3.setRoom(CommonContent.DIRECTION.NORTH, room_nandajie2);
		room_nandajie3.setRoom(CommonContent.DIRECTION.SOUTH, room_nanmen);
		room_nandajie3.setRoom(CommonContent.DIRECTION.WEST, room_geyuan);
		room_nandajie3.setRoom(CommonContent.DIRECTION.EAST, room_xiaopangu);
		room_nandajie3.setRoom(CommonContent.DIRECTION.NORTHEAST, room_yanju);
		room_nandajie3.setRoom(CommonContent.DIRECTION.NORTHWEST, room_chaguan);
		room_nandajie3.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_nandajie3.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_nandajie3.setRoom(CommonContent.DIRECTION.UP, room_nandajie2);
		room_nandajie3.setRoom(CommonContent.DIRECTION.DOWN, room_nanmen);
		//南门
		room_nanmen.setRoom(CommonContent.DIRECTION.NORTH, room_nandajie3);
		room_nanmen.setRoom(CommonContent.DIRECTION.SOUTH, nullRoom);
		room_nanmen.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_nanmen.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_nanmen.setRoom(CommonContent.DIRECTION.NORTHEAST, room_xiaopangu);
		room_nanmen.setRoom(CommonContent.DIRECTION.NORTHWEST, room_geyuan);
		room_nanmen.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_nanmen.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_nanmen.setRoom(CommonContent.DIRECTION.UP, room_nandajie3);
		room_nanmen.setRoom(CommonContent.DIRECTION.DOWN, nullRoom);
		//赌场
		room_duchang.setRoom(CommonContent.DIRECTION.EAST, room_nandajie1);
		room_duchang.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_duchang.setRoom(CommonContent.DIRECTION.NORTH, room_xidajie1);
		room_duchang.setRoom(CommonContent.DIRECTION.SOUTH,room_chaguan);
		room_duchang.setRoom(CommonContent.DIRECTION.NORTHEAST, room_guangchang);
		room_duchang.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_duchang.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_nandajie2);
		room_duchang.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_duchang.setRoom(CommonContent.DIRECTION.UP, room_xidajie1);
		room_duchang.setRoom(CommonContent.DIRECTION.DOWN, room_chaguan);
		//兵营
		room_bingying.setRoom(CommonContent.DIRECTION.WEST, room_nandajie1);
		room_bingying.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_bingying.setRoom(CommonContent.DIRECTION.NORTH, room_dongdajie1);
		room_bingying.setRoom(CommonContent.DIRECTION.SOUTH, room_yanju);
		room_bingying.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_bingying.setRoom(CommonContent.DIRECTION.NORTHWEST, room_guangchang );
		room_bingying.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_bingying.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_nandajie2);
		room_bingying.setRoom(CommonContent.DIRECTION.UP, room_dongdajie1);
		room_bingying.setRoom(CommonContent.DIRECTION.DOWN, room_yanju);
		//茶馆
		room_chaguan.setRoom(CommonContent.DIRECTION.EAST, room_nandajie2);
		room_chaguan.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_chaguan.setRoom(CommonContent.DIRECTION.NORTH, room_duchang);
		room_chaguan.setRoom(CommonContent.DIRECTION.SOUTH, room_geyuan);
		room_chaguan.setRoom(CommonContent.DIRECTION.NORTHEAST, room_nandajie1);
		room_chaguan.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_chaguan.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_nandajie3);
		room_chaguan.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_chaguan.setRoom(CommonContent.DIRECTION.UP, room_duchang);
		room_chaguan.setRoom(CommonContent.DIRECTION.DOWN, room_geyuan);
		//盐焗
		room_yanju.setRoom(CommonContent.DIRECTION.WEST, room_nandajie2);
		room_yanju.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_yanju.setRoom(CommonContent.DIRECTION.NORTH, room_bingying);
		room_yanju.setRoom(CommonContent.DIRECTION.SOUTH, room_xiaopangu);
		room_yanju.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_yanju.setRoom(CommonContent.DIRECTION.NORTHWEST, room_nandajie1);
		room_yanju.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_yanju.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_nandajie3);
		room_yanju.setRoom(CommonContent.DIRECTION.UP, room_bingying);
		room_yanju.setRoom(CommonContent.DIRECTION.DOWN, room_xiaopangu);
		//葛园
		room_geyuan.setRoom(CommonContent.DIRECTION.EAST, room_nandajie3);
		room_geyuan.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_geyuan.setRoom(CommonContent.DIRECTION.NORTH, room_chaguan);
		room_geyuan.setRoom(CommonContent.DIRECTION.SOUTH, nullRoom);
		room_geyuan.setRoom(CommonContent.DIRECTION.NORTHEAST, room_nandajie2);
		room_geyuan.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_geyuan.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_nanmen);
		room_geyuan.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_geyuan.setRoom(CommonContent.DIRECTION.UP, room_chaguan);
		room_geyuan.setRoom(CommonContent.DIRECTION.DOWN, nullRoom);
		//小盘古
		room_xiaopangu.setRoom(CommonContent.DIRECTION.WEST, room_nandajie3);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.NORTH, room_yanju);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.SOUTH, nullRoom);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.NORTHWEST, room_nandajie2);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_nanmen);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.UP, room_yanju);
		room_xiaopangu.setRoom(CommonContent.DIRECTION.DOWN, nullRoom);
		//西大街
		room_xidajie1.setRoom(CommonContent.DIRECTION.WEST, nullRoom);
		room_xidajie1.setRoom(CommonContent.DIRECTION.EAST, room_guangchang);
		room_xidajie1.setRoom(CommonContent.DIRECTION.NORTH, room_qianzhuang);
		room_xidajie1.setRoom(CommonContent.DIRECTION.SOUTH, room_duchang);
		room_xidajie1.setRoom(CommonContent.DIRECTION.NORTHEAST, room_beidajie1);
		room_xidajie1.setRoom(CommonContent.DIRECTION.NORTHWEST, nullRoom);
		room_xidajie1.setRoom(CommonContent.DIRECTION.SOUTHEAST, room_nandajie1);
		room_xidajie1.setRoom(CommonContent.DIRECTION.SOUTHWEST, nullRoom);
		room_xidajie1.setRoom(CommonContent.DIRECTION.UP, room_qianzhuang);
		room_xidajie1.setRoom(CommonContent.DIRECTION.DOWN, room_duchang);
		//东大街
		room_dongdajie1.setRoom(CommonContent.DIRECTION.WEST, room_guangchang);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.EAST, nullRoom);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.NORTH, room_kezhan);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.SOUTH, room_bingying);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.NORTHEAST, nullRoom);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.NORTHWEST, room_beidajie1);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.SOUTHEAST, nullRoom);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.SOUTHWEST, room_nandajie1);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.UP, room_kezhan);
		room_dongdajie1.setRoom(CommonContent.DIRECTION.DOWN, room_bingying);
		
		//地图
		cityMap.put(room_guangchang.getRoomId(), room_guangchang);
		cityMap.put(room_beidajie1.getRoomId(), room_beidajie1);
		cityMap.put(room_beidajie2.getRoomId(), room_beidajie2);
		cityMap.put(room_beidajie3.getRoomId(), room_beidajie3);
		cityMap.put(room_beimen.getRoomId(), room_beimen);
		cityMap.put(room_qianzhuang.getRoomId(), room_qianzhuang);
		cityMap.put(room_kezhan.getRoomId(), room_kezhan);
		cityMap.put(room_dangpu.getRoomId(), room_dangpu);
		cityMap.put(room_yizhan.getRoomId(), room_yizhan);
		cityMap.put(room_chmiao.getRoomId(), room_chmiao);
		cityMap.put(room_xiaochidian.getRoomId(), room_xiaochidian);
		cityMap.put(room_nandajie1.getRoomId(), room_nandajie1);
		cityMap.put(room_nandajie2.getRoomId(), room_nandajie2);
		cityMap.put(room_nandajie3.getRoomId(), room_nandajie3);
		cityMap.put(room_nanmen.getRoomId(), room_nanmen);
		cityMap.put(room_duchang.getRoomId(), room_duchang);
		cityMap.put(room_bingying.getRoomId(), room_bingying);
		cityMap.put(room_chaguan.getRoomId(), room_chaguan);
		cityMap.put(room_yanju.getRoomId(), room_yanju);
		cityMap.put(room_geyuan.getRoomId(), room_geyuan);
		cityMap.put(room_xiaopangu.getRoomId(), room_xiaopangu);
		cityMap.put(room_xidajie1.getRoomId(), room_xidajie1);
		cityMap.put(room_dongdajie1.getRoomId(), room_dongdajie1);
		cityMap.put(nullRoom.getRoomId(), nullRoom);
	}
}
