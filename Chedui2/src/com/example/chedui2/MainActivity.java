package com.example.chedui2;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

public class MainActivity extends Activity {

	ExpandableListView listView;
	ExpandAdapter mAdapter;
	List<String> list1 = new ArrayList<String>();
	List<List<CheduiBeans>> list2 = new ArrayList<List<CheduiBeans>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initData();
		initView();
	}

	private void initData() {
		/*list1.add("我创建的车队");
		CheduiBeans bean1 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"蓝天车队");
		CheduiBeans bean2 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"青海车队");
		List<CheduiBeans> list3 = new ArrayList<CheduiBeans>();
		list3.add(bean1);
		list3.add(bean2);
		for (int i = 0; i < list1.size(); i++) {
			list2.add(list3);
		}*/
		//addInfo("我创建的车队", list3);
		/*list1.add("我加入的车队");
		CheduiBeans bean3 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"西藏车队");
		CheduiBeans bean4 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"黄河车队");
		List<CheduiBeans> list4 = new ArrayList<CheduiBeans>();
		list4.add(bean3);
		list4.add(bean4);
		for (int i = 0; i < list1.size(); i++) {
			list2.add(list4);
		}*/
		//addInfo("我加入的车队", list4);
		// 添加第一组数据
		list1.add("我创建的车队");
		//list1.add("我加入的车队");
		CheduiBeans bean1 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"蓝天车队");
		CheduiBeans bean2 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"青海车队");
		List<CheduiBeans> list3 = new ArrayList<CheduiBeans>();
		list3.add(bean1);
		list3.add(bean2);
		for (int i = 0; i < list1.size(); i++) {
			list2.add(list3);
		}
		//添加第二组数据
		list1.add("我加入的车队");
		
		CheduiBeans bean3 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"西藏车队");
		CheduiBeans bean4 = new CheduiBeans(
				"https://img02.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fcdn.t02.pic.sogou.com%2Fac75323d6b6de243-dde843d37055636a-758eb8151467faf568652acc23371a45.jpg&appid=122",
				"黄河车队");
		List<CheduiBeans> list4 = new ArrayList<CheduiBeans>();
		list4.add(bean3);
		list4.add(bean4);
		for (int i = 0; i < list1.size(); i++) {
			//list2.remove(list3);
			list2.add(list4);
		}
		
		
	}
	/*public void addInfo(String group,List<CheduiBeans> list3){
		list1.add(group);
		list3=new ArrayList<CheduiBeans>();
		for (int i = 0; i < list1.size(); i++) {
			list2.add(list3);
		}
		
		
	}*/

	private void initView() {
		// TODO Auto-generated method stub
		listView = (ExpandableListView) findViewById(R.id.expandlistview);
		
		mAdapter = new ExpandAdapter(MainActivity.this, list1, list2);
		
		listView.setAdapter(mAdapter);
		listView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				return true;
			}
		});
	}

}
