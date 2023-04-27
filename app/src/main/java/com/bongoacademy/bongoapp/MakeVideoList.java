
package com.bongoacademy.bongoapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("akPObYZ2e6c", "কেয়ামত দিন বিশ্বনবী কোথায় থাকবেন", "কেয়ামত দিন বিশ্বনবী কোথায় থাকবেন,বাংলা ওয়াজ,মিজানুর রহমান আজহারী");
		addVideoItem("BmH1kUqZDz8", "ওমর রাঃ এর জীবনী", "হযরত ওমর (রাঃ)-এর পূর্ণাঙ্গ জীবনী মিজানুর রহমান আজহারী");
		addVideoItem("1EzT4VUOvJI", "জান্নাতের বর্ণনা", "জান্নাতের বর্ণনা সুন্দর দিলেন মিজানুর রহমান আজহারী হুজুর");
		addVideoItem("qZfQQm6YKf4", "বিশ্বনবী সাঃ এর জীবনী", "বিশ্বনবী সাঃ এর জীবনী ডঃ মিজানুর রহমান আযহারী");
		addVideoItem("w1sym6nI8_w", "স্বামী স্ত্রীর ভালোবাসা", "বয়ানে মিজানুর রহমান আজহারীর");
		addVideoItem("PghcOWUL8Ws", "সহযরত ওমর (রাঃ)-এর ইসলাম গ্রহন", "হযরত ওমর (রাঃ)-এর ইসলাম গ্রহন- ড. মিজানুর রহমান আজহারী।");
		addVideoItem("loofai-mde4", "নামাজের মধ্যে খারাপ চিন্তা আসলে কি করবেন?", "নামাজের সঠিক নিয়ম সবার জানা জরুরি মিজানুর রহমান আজহারী।");
		addVideoItem("RRecgk8Bi_0", "সমনে রাখবেন ২ দোয়া আল্লাহ কখনো ফিরিয়ে দেয় না", "মিজানুর রহমান আজহারী নতুন ওয়াজ");
		addVideoItem("UTDfyMSXNX4", "ইসলাম ধর্ম কেন সেরা", "মইসলাম ধর্মের অজানা ১০টি তথ্য");
		addVideoItem("fBSuRJwzRdk", "মাজহাব মানেই কি বিভক্তি?", "মাজহাব কি ও কেন? মাজহাব মানা কি আবশ্যক? মাজহাব চারটিতে সীমাবদ্ধ কেন? প্রশ্নগুলোর বিস্তারিত উত্তর জানতে পুরো আলোচনাটি শুনুন");
		addVideoItem("AXJIj0AnbTA", "যাকাত কেন দেওয়া জরুরি", " যাকাত সর্ম্পকে আলোচনা করলেন মিজানুর রহমান আজহারি");
		addVideoItem("TbQJ6MKtp5Q", "মুসা আঃ এর জীবনী এবং আমাদের শিক্ষা", " আল্লাহ তায়ালা আমাদের সবাইকে ইসলাম ভালোভাবে বুঝার এবং মানার তাওফিক দান করুন");
		addVideoItem("aLbQEzOhvs0", "জেনে অবাক হবেন, কত বড় সুপার হিরো ছিলেন হযরত ওমর (রাঃ)", "আল্লাহ তুমি আমাদের সবাইকে হেদায়েত দান করুন' আমাদেরকে কবুল করুন");
		addVideoItem("htSornje5FE", "কিয়ামতের দিন (সাঃ) উম্মাবতর জন্য কাদার কাহিনি", "যে শুনে সেই কাদে রাসুল সাঃ জীবনী। ডঃ মিজানুর রহমান আজহারী");
		addVideoItem("LpPP3kzNGVQ", "দূঃখের সমাদান দিলেন কোরআনের আলোকে", "হতাশ হবেনা কঠিন বিপদে মিজানুর রহমান আজহারী");
		addVideoItem("eWkDWqJGSNY", "হতাশ ব্যক্তিদের জন্য, সূরা আদ-দুহা এর শিক্ষা", "মিজানুর রহমান আজহারী");
		addVideoItem("KlTrm8u3JpI", "সূরা মুজ্জাম্মিল এর তাফসীর", "মিজানুর রহমান আজহারী নতুন ওয়াজ");
		addVideoItem("c71LiwVzeG8", "কত সুন্দর পৃথিবী তার চেয়েও বেশি সুন্দর জান্নাত", "মিজানুর রহমান আজহারী নতুন ওয়াজ");
		addVideoItem("OpXwH03Mjuw", "লোকমান হাকিম এর জীবনী", "মিজানুর রহমান আজহারী নতুন ওয়াজ জান্নাত জাহান্নাম");
		addVideoItem("GoSwEBp7e9s", "চার খলিফার জীবনি", "মখুলাফায়ে রাশেদিন জীবনি এবং সাহাবীদের জীবনি নিয়ে অসাধারণ আলোচনা");
		addVideoItem("GoSwEBp7e9s", "চার খলিফার জীবনি", "মখুলাফায়ে রাশেদিন জীবনি এবং সাহাবীদের জীবনি নিয়ে অসাধারণ আলোচনা");
		createPlayList("মিজানুর রহমান আজহারী", R.drawable.category_1);
		//=======================================================================gaya===

		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayList("Funny Cat", R.drawable.category_2);
		//==========================================================================


		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayList("Funny Baby", R.drawable.category_3);
		//==========================================================================


		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("GgaxcNmm4UU", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayList("Funny Memes", R.drawable.category_4);
		//==========================================================================













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

