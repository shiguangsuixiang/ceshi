package com.example.chedui2;

import java.util.ArrayList;
import java.util.List;

import com.lidroid.xutils.BitmapUtils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandAdapter extends BaseExpandableListAdapter {

	Context context;
	LayoutInflater mInflater;
	LayoutInflater mInflater2;
	List<String> list1=new ArrayList<String>();
	List<List<CheduiBeans>> list2=new ArrayList<List<CheduiBeans>>();
	GroupViewHolder gHolder;
	ChildViewHolder cHolder;
	BitmapUtils bitmapUtils;
	

	public ExpandAdapter(Context context, List<String> list1,
			List<List<CheduiBeans>> list2) {
		super();
		this.context = context;
		this.list1 = list1;
		this.list2 = list2;
		mInflater=LayoutInflater.from(context);
		mInflater2=LayoutInflater.from(context);
		bitmapUtils=new BitmapUtils(context);
		bitmapUtils.configDefaultLoadingImage(R.drawable.ic_launcher);
		bitmapUtils.configDefaultLoadFailedImage(R.drawable.ic_launcher);
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return list1.size();
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return list2.get(groupPosition).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return list1.get(groupPosition);
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return list2.get(groupPosition).get(childPosition);
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView==null) {
			convertView=mInflater.inflate(R.layout.base_item, null);
			gHolder=new GroupViewHolder();
			gHolder.groupTextView=(TextView) convertView.findViewById(R.id.create_chedui);
			convertView.setTag(gHolder);
		}else {
			gHolder=(GroupViewHolder) convertView.getTag();
		}
		gHolder.groupTextView.setText(list1.get(groupPosition));
		return convertView;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView==null) {
			convertView=mInflater2.inflate(R.layout.detail_item, null);
			cHolder=new ChildViewHolder();
			cHolder.childTextView=(TextView) convertView.findViewById(R.id.chedui_name);
			cHolder.imageView=(ImageView) convertView.findViewById(R.id.chedui_image);
			convertView.setTag(cHolder);
		}else {
			cHolder=(ChildViewHolder) convertView.getTag();
		}
		//Log.e("list", list2.get(groupPosition).get(childPosition).toString());
		cHolder.childTextView.setText(list2.get(groupPosition).get(childPosition).getName());
		bitmapUtils.display(cHolder.imageView, list2.get(groupPosition).get(childPosition).getImage());
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}
	class GroupViewHolder{
		TextView groupTextView;
	}
	class ChildViewHolder{
		ImageView imageView;
		TextView childTextView;
	}

}
