package twoday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import fourdays.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/22.
 */
public class TwoDayListviewAdapter extends BaseAdapter{
    ArrayList<Student> str;
    Context context;

    public TwoDayListviewAdapter(Context context) {
        this.context = context;
        str = new ArrayList<Student>();
    }

    public ArrayList<Student> getStr() {
        return str;
    }

    public void setStr(ArrayList<Student> str) {
        this.str = str;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return str.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh=null;
        if (convertView==null){
            vh=new ViewHolder();//实例化缓冲类
            convertView = LayoutInflater.from(context).inflate(R.layout.twoday_listview_item,null);
             vh.name_tv = (TextView) convertView.findViewById(R.id.twoday_listview_name_tv);
             vh.cla_tv = (TextView) convertView.findViewById(R.id.twoday_listview_cla_tv);
             vh.grade_tv = (TextView) convertView.findViewById(R.id.twoday_listview_grade_tv);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }

        vh.name_tv.setText(str.get(position).getName());
        vh.cla_tv.setText(str.get(position).getCla());
        vh.grade_tv.setText(str.get(position).getGrade());
        return convertView;

    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//            convertView = LayoutInflater.from(context).inflate(R.layout.twoday_listview_item,null);
//            TextView name_tv = (TextView) convertView.findViewById(R.id.twoday_listview_name_tv);
//            TextView cla_tv = (TextView) convertView.findViewById(R.id.twoday_listview_cla_tv);
//            TextView grade_tv = (TextView) convertView.findViewById(R.id.twoday_listview_grade_tv);
//            name_tv.setText(str.get(position).getName());
//            cla_tv.setText(str.get(position).getCla());
//            grade_tv.setText(str.get(position).getGrade());
//            return convertView;
//    }
    class ViewHolder{
        TextView name_tv,cla_tv,grade_tv;
    }
}
