```
**18CA386-Android Application Development**

**Assignment 3**

**S4MCA**

1. Use a list view to display list of games and display the selected one. (Use Array Adapter). On selecting a particular list item, the background color of the selected list item must be highlighted to blue.

**Design**

![](RackMultipart20200420-4-1uy9qe0_html_5717165ad59c8860.png) ![](RackMultipart20200420-4-1uy9qe0_html_5d573ec4daa005c3.png)

**Code**

Activity\_main.xml

1. \&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;androidx.constraintlayout.widget.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;
xmlns:tools=&quot;http://schemas.android.com/tools&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
tools:context=&quot;.MainActivity&quot;\&gt;

 \&lt;ListView
android:id=&quot;@+id/simpleListView&quot;
android:layout\_width=&quot;401dp&quot;
android:layout\_height=&quot;0dp&quot;
android:divider=&quot;@color/material\_blue\_grey\_800&quot;
android:dividerHeight=&quot;1dp&quot;
app:layout\_constraintBottom\_toBottomOf=&quot;parent&quot;
app:layout\_constraintEnd\_toEndOf=&quot;parent&quot;
app:layout\_constraintStart\_toStartOf=&quot;parent&quot;
app:layout\_constraintTop\_toTopOf=&quot;parent&quot;
app:layout\_constraintVertical\_bias=&quot;0.0&quot;
android:listSelector=&quot;#0000ff&quot;/\&gt;

 \&lt;/androidx.constraintlayout.widget.ConstraintLayout\&gt;

Layout.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:orientation=&quot;vertical&quot;\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;10dp&quot;
android:textSize=&quot;20sp&quot;
android:textColorHighlight =&quot;#ffffff &quot;
/\&gt;
 \&lt;/LinearLayout\&gt;

Main\_activity.java

package com.example.gamelist;

 import androidx.appcompat.app.AppCompatActivity;

 import android.os.Bundle;
 import android.widget.ArrayAdapter;
 import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {
 ListView simpleList;
String countryList[] = {&quot;Call of Duty&quot;, &quot;GTA 4&quot;, &quot;Sims 3&quot;, &quot;PUBG&quot;, &quot;Battle Field 3&quot;, &quot;Assassin&#39;s Creed&quot;};

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState); setContentView(R.layout._activity\_main_);
simpleList = (ListView)findViewById(R.id._simpleListView_);
ArrayAdapter\&lt;String\&gt; arrayAdapter = new ArrayAdapter\&lt;String\&gt;(this, R.layout._layout_, R.id._textView_, countryList);
simpleList.setAdapter(arrayAdapter);
}
 }

**Output**

![](RackMultipart20200420-4-1uy9qe0_html_8c43532ce1f8ece1.png)

1. Create a &#39;Form &#39;using all the basic views (can use any layout). On Submitting the form, the details should be displayed in the next activity. [use Intent]

[Try passing data as individual key-value pair and using Bundle]

**Design**

![](RackMultipart20200420-4-1uy9qe0_html_e6855f73565b72c6.png) ![](RackMultipart20200420-4-1uy9qe0_html_5e12fd92a587beb2.png)

**Code**
activity\_main.xml

\&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
xmlns:tools=&quot;http://schemas.android.com/tools&quot;
android:id=&quot;@+id/layout&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:background=&quot;#252525&quot;
android:orientation=&quot;vertical&quot;
android:padding=&quot;20dp&quot;
tools:context=&quot;.MainActivity&quot; \&gt;

 \&lt;TextView
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:text=&quot;Enter name&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot;
android:textColor=&quot;#ffffff&quot; /\&gt;

 \&lt;EditText
android:id=&quot;@+id/name&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:ems=&quot;10&quot;
android:inputType=&quot;textPersonName&quot;
android:textColor=&quot;#ffffff&quot; \&gt;

 \&lt;requestFocus /\&gt;
 \&lt;/EditText\&gt;

 \&lt;TextView
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:text=&quot;Enter phone number&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot;
android:textColor=&quot;#ffffff&quot; /\&gt;

 \&lt;EditText
android:id=&quot;@+id/phone\_no&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:ems=&quot;10&quot;
android:inputType=&quot;number&quot;
android:textColor=&quot;#ffffff&quot; /\&gt;

 \&lt;TextView
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:text=&quot;Enter age&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot;
android:textColor=&quot;#ffffff&quot; /\&gt;

 \&lt;EditText
android:id=&quot;@+id/age&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:ems=&quot;10&quot;
android:inputType=&quot;number&quot;
android:textColor=&quot;#ffffff&quot; /\&gt;

 \&lt;CheckBox
android:id=&quot;@+id/married&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:text=&quot;Married&quot;
android:textColor=&quot;#ffffff&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot; /\&gt;

 \&lt;Button
android:id=&quot;@+id/send&quot;
android:layout\_width=&quot;100dp&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:text=&quot;Send&quot;
android:textSize=&quot;20dp&quot; /\&gt;

 \&lt;/LinearLayout\&gt;

Activity\_second.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:orientation=&quot;vertical&quot;
android:padding=&quot;20dp&quot; \&gt;

 \&lt;TextView
android:id=&quot;@+id/showName&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/showPhoneNumber&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/showAge&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/showIsMarried&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_marginTop=&quot;20dp&quot;
android:textAppearance=&quot;?android:attr/textAppearanceLarge&quot; /\&gt;

 \&lt;/LinearLayout\&gt;

AndroidSecondActivity.java

package com.example.intentbundle;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.widget.TextView;

 public class AndroidSecondActivity extends Activity {
public TextView showName, showPhoneNumber, age, showIsMarried;

@Override
protected void onCreate(Bundle savedInstanceState) {
// _TODO Auto-generated method stub_
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_second_);

// initialize TextViews
initializeViews();

// get the Intent that started this Activity
Intent in = getIntent();

// get the Bundle that stores the data of this Activity
Bundle b = in.getExtras();

// getting data from bundle
String nameString = b.getString(&quot;fullname&quot;);

 long phoneNumberLong = b.getLong(&quot;phoneNumber&quot;);
String phoneNumberString = Long._toString_(phoneNumberLong);

 double ageDouble = b.getDouble(&quot;age&quot;);
String ageString = Double._toString_(ageDouble);

 boolean isMarriedBoolean = b.getBoolean(&quot;married&quot;);

// show data to layout
showName.setText(&quot;Name : &quot; + nameString);
showPhoneNumber.setText(&quot;Phone number : &quot; + phoneNumberString);
age.setText(&quot;Age : &quot; + ageString);
showIsMarried.setText(&quot;Is married : &quot; + isMarriedBoolean);
}

public void initializeViews() {
showName = (TextView) findViewById(R.id._showName_);
showPhoneNumber = (TextView) findViewById(R.id._showPhoneNumber_);
age = (TextView) findViewById(R.id._showAge_);
showIsMarried = (TextView) findViewById(R.id._showIsMarried_);
}
 }

MainActivity.java

package com.example.intentbundle;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.View.OnClickListener;
 import android.widget.Button;
 import android.widget.CheckBox;
 import android.widget.EditText;
 import android.widget.Toast;

 public class MainActivity extends Activity {
public EditText name, phone\_no, age;
 public CheckBox married;

 public String fullname, phoneNumber, ageBirth;
 public boolean isMarried = false;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_main_);

// initialize edit texts
initializeEditTexts();

Button send = (Button) findViewById(R.id._send_);
send.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {

// Getting data from the form
getDataFromForm();

 if (name.length() == 0 || phone\_no.length() == 0 || age.length() == 0) {
//show toast when not correctly completed
Toast._makeText_(getApplicationContext(), &quot;Complete the form correctly&quot;, Toast._LENGTH\_SHORT_).show();
} else {
// Converting phoneNumber to long type
long phone = Long._parseLong_(phoneNumber);
// Converting ageBirth to double type
double ageDouble = Long._parseLong_(ageBirth);

// Creating Bundle object
Bundle b = new Bundle();

// Storing data into bundle
b.putString(&quot;fullname&quot;, fullname);
b.putLong(&quot;phoneNumber&quot;, phone);
b.putDouble(&quot;age&quot;, ageDouble);
b.putBoolean(&quot;married&quot;, isMarried);

// Creating Intent object
Intent in = new Intent(MainActivity.this, AndroidSecondActivity.class);

// Storing bundle object into intent
in.putExtras(b);
startActivity(in);
}
 }
 });
}

public void initializeEditTexts() {
name = (EditText) findViewById(R.id._name_);
phone\_no = (EditText) findViewById(R.id._phone\_no_);
age = (EditText) findViewById(R.id._age_);
married = (CheckBox) findViewById(R.id._married_);
}

public void getDataFromForm() {
fullname = name.getText().toString();
phoneNumber = phone\_no.getText().toString();
ageBirth = age.getText().toString();
isMarried = married.isChecked();
}

 }

**Output**

![](RackMultipart20200420-4-1uy9qe0_html_2ca8ef35fa572632.png) ![](RackMultipart20200420-4-1uy9qe0_html_1c3ac80e8dc27e2.png)

1. Use a custom array adapter and implement a custom list view. Each list must have an image, First name, email and contact number.

![](RackMultipart20200420-4-1uy9qe0_html_fc839400cb75af08.png)

Design

![](RackMultipart20200420-4-1uy9qe0_html_7705c617036a305a.png) ![](RackMultipart20200420-4-1uy9qe0_html_af3088a38dd1168d.png)

Code

Activity\_main.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:orientation=&quot;vertical&quot;\&gt;

 \&lt;ListView
android:id=&quot;@+id/simpleListView&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:divider=&quot;@color/material\_blue\_grey\_800&quot;
android:dividerHeight=&quot;1dp&quot;
android:footerDividersEnabled=&quot;false&quot; /\&gt;
 \&lt;/LinearLayout\&gt;

Activity\_listview.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:orientation=&quot;vertical&quot;
\&gt;

 \&lt;ImageView
android:id=&quot;@+id/icon&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;135dp&quot;
android:src=&quot;@drawable/pixels&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView2&quot;
android:layout\_width=&quot;423dp&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView3&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;
 \&lt;/LinearLayout\&gt;

MainActivity.java

package com.example.customlistview;


 import android.app.Activity;
 import android.os.Bundle;
 import android.widget.ListView;

 public class MainActivity extends Activity {

 ListView simpleList;
String nameList[] = {&quot;Abhilash&quot;, &quot;Max&quot;, &quot;Christy&quot;, &quot;Sam&quot;, &quot;Rika&quot;, &quot;Jimmy&quot;};
String emailList[] = {&quot;abhilash@gmail.com&quot;, &quot;Max@gmail.com&quot;, &quot;Christy@gmail.com&quot;, &quot;Sam@gmail.com&quot;, &quot;Rika@gmail.com&quot;, &quot;Jimmy@gmail.com&quot;};
String phone[] = {&quot;9655464123&quot;, &quot;465413554&quot;, &quot;645642312&quot;, &quot;46563115&quot;, &quot;544546113&quot;, &quot;456213511&quot;};
 int images[] = {R.drawable._me_, R.drawable._person1_, R.drawable._person2_, R.drawable._person3_, R.drawable._person4_, R.drawable._pug_};

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_main_);
simpleList = (ListView) findViewById(R.id._simpleListView_);
CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), nameList, emailList, phone, images);
simpleList.setAdapter(customAdapter);
}
 }

CustomAdapter.java

package com.example.customlistview;

 import android.content.Context;
 import android.media.Image;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.BaseAdapter;
 import android.widget.ImageView;
 import android.widget.TextView;

 import java.util.zip.Inflater;

 public class CustomAdapter extends BaseAdapter {
 Context context;
String countryList[];
String emailList[];
String phoneList[];
 int flags[];
LayoutInflater inflter;

 public CustomAdapter(Context applicationContext, String[] countryList, String emailList[],String phoneList[], int[] flags) {
this.context = context;
 this.countryList = countryList;
 this.flags = flags;
 this.emailList = emailList;
 this.phoneList = phoneList;

inflter = (LayoutInflater._from_(applicationContext));
}

@Override
public int getCount() {
return countryList.length;
}

@Override
public Object getItem(int i) {
return null;
}

@Override
public long getItemId(int i) {
return 0;
}

@Override
public View getView(int i, View view, ViewGroup viewGroup) {
 view = inflter.inflate(R.layout._activity\_listview_, null);
TextView country = (TextView) view.findViewById(R.id._textView_);
TextView email = (TextView) view.findViewById(R.id._textView2_);
TextView number = (TextView) view.findViewById(R.id._textView3_);
ImageView icon = (ImageView) view.findViewById(R.id._icon_);
country.setText(countryList[i]);
email.setText(emailList[i]);
number.setText(phoneList[i]);
icon.setImageResource(flags[i]);
 return view;
}

 }

**Output**

![](RackMultipart20200420-4-1uy9qe0_html_9db4e5024fab25b0.png)

1. Create a custom list view like one given below.

![](RackMultipart20200420-4-1uy9qe0_html_a72244a305363eef.png)

  1. Each list must have an arrow icon on the right end
  2. On clicking the each list, a new page should display the description about the movie and an image related to that.

**Design**

![](RackMultipart20200420-4-1uy9qe0_html_275aad3cdf41e7eb.png) ![](RackMultipart20200420-4-1uy9qe0_html_4e1adc125a962c20.png) ![](RackMultipart20200420-4-1uy9qe0_html_a9124b4920f99cf9.png)

**Code**

**MainActivity.java**

package com.example.songlist;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.GridView;
 import android.widget.ListView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

int imageList[] = {R.drawable._katyperry_};
ListView gv;
String titleList[] = {&quot;Roar&quot;};
String artistList[] = {&quot;Katy Perry&quot;};

 protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_main_);
gv = (ListView) findViewById(R.id._list_);
CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), imageList, titleList ,artistList);
gv.setAdapter(customAdapter);

}
 }

**CustomAdapter.java**

package com.example.songlist;
 import android.content.Context;
 import android.content.Intent;
 import android.media.Image;
 import android.os.Bundle;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.AdapterView;
 import android.widget.BaseAdapter;
 import android.widget.ImageView;
 import android.widget.TextView;
 import android.widget.Toast;

 import java.util.zip.Inflater;

 import static android.content.Intent._FLAG\_ACTIVITY\_NEW\_TASK_;


 public class CustomAdapter extends BaseAdapter{
private Context context;
 int imageList[] ;
String titleList[] ;
String artistList[] ;
LayoutInflater inflter;

 public CustomAdapter(Context applicationContext, int[] imageList, String titleList[],String artistList[]) {
this.context = context;
 this.imageList = imageList;
 this.titleList = titleList;
 this.artistList = artistList;
inflter = (LayoutInflater._from_(applicationContext));
}

public int getCount() {
return imageList.length;
}

public Object getItem(int i) {
return null;
}

public long getItemId(int i) {
return 0;
}

public View getView(final int i, View view, ViewGroup viewGroup) {
 view = inflter.inflate(R.layout._list\_row_, null);
View holder = view;
TextView title = (TextView) view.findViewById(R.id._title_);
TextView artist = (TextView) view.findViewById(R.id._artist_);
ImageView icon = (ImageView) view.findViewById(R.id._list\_image_);
ImageView arrow = (ImageView) view.findViewById(R.id._arrow_);
arrow.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {

 Intent in = new Intent(v.getContext(), SongDetails.class);
// passing array index
Bundle b = new Bundle();

// Storing data into bundle
b.putString(&quot;title&quot;, titleList[i]);
b.putString(&quot;author&quot;, artistList[i]);
b.putInt(&quot;image&quot;, imageList[i]);

// Creating Intent object
in.addFlags(_FLAG\_ACTIVITY\_NEW\_TASK_);

// Storing bundle object into intent
in.putExtras(b);

// context.startActivity(in);
v.getContext().startActivity(in);
}
 });


title.setText(titleList[i]);
artist.setText(artistList[i]);
icon.setImageResource(imageList[i]);
 return view;
}

 }

**Song Details.java**

package com.example.songlist;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.widget.ImageView;
 import android.widget.TextView;

 public class SongDetails extends Activity {
public TextView title, artist;
ImageView image;
@Override
protected void onCreate(Bundle savedInstanceState) {
// _TODO Auto-generated method stub_
super.onCreate(savedInstanceState);
setContentView(R.layout._description\_layout_);

// initialize TextViews
initializeViews();

// get the Intent that started this Activity
Intent in = getIntent();

// get the Bundle that stores the data of this Activity
Bundle b = in.getExtras();

// getting data from bundle
String nameString = b.getString(&quot;title&quot;);
String authorString = b.getString(&quot;author&quot;);
 int imageID = b.getInt(&quot;image&quot;);


// show data to layout
title.setText(&quot;Title : &quot; + nameString);
artist.setText(&quot;Artist: &quot;+authorString);

}

public void initializeViews() {
title = (TextView) findViewById(R.id._textView_);
artist = (TextView) findViewById(R.id._textView2_);
image = (ImageView) findViewById(R.id._icon_);
}
 }

**activity\_main.xml**

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;fill\_parent&quot;
android:orientation=&quot;vertical&quot;\&gt;

 \&lt;ListView
android:id=&quot;@+id/list&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:divider=&quot;#b5b5b5&quot;
android:dividerHeight=&quot;1dp&quot;
android:listSelector=&quot;@drawable/list\_selector&quot; /\&gt;

 \&lt;/LinearLayout\&gt;

**Description\_layout.xml**

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:orientation=&quot;vertical&quot;
\&gt;

 \&lt;ImageView
android:id=&quot;@+id/icon&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:src=&quot;@drawable/katyperry&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView2&quot;
android:layout\_width=&quot;423dp&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;

 \&lt;TextView
android:id=&quot;@+id/textView3&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_gravity=&quot;center&quot;
android:padding=&quot;40px&quot; /\&gt;
 \&lt;/LinearLayout\&gt;

**List\_row.xml**

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;RelativeLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:background=&quot;@drawable/list\_selector&quot;
android:orientation=&quot;horizontal&quot;
android:padding=&quot;5dip&quot; \&gt;

\&lt;!-- ListRow Left sied Thumbnail image --\&gt;
\&lt;LinearLayout android:id=&quot;@+id/thumbnail&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:padding=&quot;3dip&quot;
android:layout\_alignParentLeft=&quot;true&quot;
android:background=&quot;@drawable/image\_bg&quot;
android:layout\_marginRight=&quot;5dip&quot;\&gt;

 \&lt;ImageView
android:id=&quot;@+id/list\_image&quot;
android:layout\_width=&quot;50dip&quot;
android:layout\_height=&quot;50dip&quot;
android:src=&quot;@drawable/katyperry&quot;/\&gt;

 \&lt;/LinearLayout\&gt;

\&lt;!-- Title Of Song--\&gt;
\&lt;TextView
android:id=&quot;@+id/title&quot;
android:layout\_width=&quot;wrap\_content&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_alignTop=&quot;@+id/thumbnail&quot;
android:layout\_toRightOf=&quot;@+id/thumbnail&quot;
android:text=&quot;Katy Perry - Roar&quot;
android:textColor=&quot;#040404&quot;
android:typeface=&quot;sans&quot;
android:textSize=&quot;15dip&quot;
android:textStyle=&quot;bold&quot;/\&gt;

\&lt;!-- Artist Name --\&gt;
\&lt;TextView
android:id=&quot;@+id/artist&quot;
android:layout\_width=&quot;fill\_parent&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_below=&quot;@id/title&quot;
android:textColor=&quot;#343434&quot;
android:textSize=&quot;10dip&quot;
android:layout\_marginTop=&quot;1dip&quot;
android:layout\_toRightOf=&quot;@+id/thumbnail&quot;
android:text=&quot;Just gona stand there and ...&quot; /\&gt;

\&lt;!-- Rightend Duration --\&gt;

 \&lt;!-- Rightend Arrow --\&gt;
\&lt;TextView
android:id=&quot;@+id/duration&quot;
android:layout\_width=&quot;37dp&quot;
android:layout\_height=&quot;wrap\_content&quot;
android:layout\_alignTop=&quot;@id/title&quot;
android:layout\_alignParentStart=&quot;true&quot;
android:layout\_alignParentEnd=&quot;true&quot;
android:layout\_alignParentRight=&quot;true&quot;
android:layout\_marginStart=&quot;360dp&quot;
android:layout\_marginTop=&quot;6dp&quot;
android:layout\_marginEnd=&quot;14dp&quot;
android:layout\_marginRight=&quot;9dp&quot;
android:gravity=&quot;right&quot;
android:text=&quot;5:45&quot;
android:textColor=&quot;#10bcc9&quot;
android:textSize=&quot;10dip&quot;
android:textStyle=&quot;bold&quot; /\&gt;

 \&lt;ImageView
android:id=&quot;@+id/arrow&quot;
android:layout\_width=&quot;40dp&quot;
android:layout\_height=&quot;40dp&quot;
android:layout\_alignParentStart=&quot;true&quot;
android:layout\_alignParentEnd=&quot;true&quot;
android:layout\_alignParentRight=&quot;true&quot;
android:layout\_centerVertical=&quot;true&quot;
android:layout\_marginStart=&quot;376dp&quot;
android:layout\_marginEnd=&quot;4dp&quot;
android:src=&quot;@drawable/arrow&quot; /\&gt;

 \&lt;/RelativeLayout\&gt;

**Output**

![](RackMultipart20200420-4-1uy9qe0_html_7c4b70128aecaa21.png) ![](RackMultipart20200420-4-1uy9qe0_html_73559fa3b054e5a.png)

1. Use Grid View and create a gallery to display images. On clicking an image in the grid view, that image should be displayed in full size.

**Design**

![](RackMultipart20200420-4-1uy9qe0_html_fc2620dee2d4d74b.png) ![](RackMultipart20200420-4-1uy9qe0_html_e5b3226dd3885346.png)

**Code**

ImageAdapter.java

package com.example.gallery;

 import android.content.Context;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.BaseAdapter;
 import android.widget.GridView;
 import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
private Context mContext;
 public ImageAdapter(Context c) {
mContext = c;
}
public int getCount() {
return thumbImages.length;
}
public Object getItem(int position) {
return null;
}
public long getItemId(int position) {
return 0;
}
// create a new ImageView for each item referenced by the Adapter
public View getView(int position, View convertView, ViewGroup parent) {
 ImageView imageView = new ImageView(mContext);
imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
imageView.setScaleType(ImageView.ScaleType._CENTER\_CROP_);
imageView.setPadding(8, 8, 8, 8);
imageView.setImageResource(thumbImages[position]);
 return imageView;
}
// Add all our images to arraylist
public Integer[] thumbImages = {
 R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._me_
};
}

Activity\_main.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;GridView xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:id=&quot;@+id/gridview&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;
android:columnWidth=&quot;110dp&quot;
android:numColumns=&quot;auto\_fit&quot;
android:verticalSpacing=&quot;10dp&quot;
android:horizontalSpacing=&quot;10dp&quot;
android:stretchMode=&quot;columnWidth&quot;
android:gravity=&quot;center&quot; /\&gt;

MainActivity.java

package com.example.gallery;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.GridView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._activity\_main_);
GridView gv = (GridView) findViewById(R.id._gridview_);
gv.setAdapter(new ImageAdapter(this));
gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
public void onItemClick(AdapterView\&lt;?\&gt; parent, View v, int position, long id) {
// Sending image id to FullScreenActivity
Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
// passing array index
i.putExtra(&quot;id&quot;, position);
startActivity(i);
}
 });
}
 }

ImageAdapter.java

package com.example.gallery;

 import android.content.Context;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.BaseAdapter;
 import android.widget.GridView;
 import android.widget.ImageView;

 public class ImageAdapter extends BaseAdapter {
private Context mContext;
 public ImageAdapter(Context c) {
mContext = c;
}
public int getCount() {
return thumbImages.length;
}
public Object getItem(int position) {
return null;
}
public long getItemId(int position) {
return 0;
}
// create a new ImageView for each item referenced by the Adapter
public View getView(int position, View convertView, ViewGroup parent) {
 ImageView imageView = new ImageView(mContext);
imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
imageView.setScaleType(ImageView.ScaleType._CENTER\_CROP_);
imageView.setPadding(8, 8, 8, 8);
imageView.setImageResource(thumbImages[position]);
 return imageView;
}
// Add all our images to arraylist
public Integer[] thumbImages = {
 R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._person3_, R.drawable._person4_,
R.drawable._me_, R.drawable._person2_,
R.drawable._me_
};
}

FullImageActivity.java

package com.example.gallery;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.widget.ImageView;


 public class FullImageActivity extends Activity {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout._image\_details_);
// Get intent data
Intent i = getIntent();
// Get Selected Image Id
int position = i.getExtras().getInt(&quot;id&quot;);
ImageAdapter imageAdapter = new ImageAdapter(this);
ImageView imageView = (ImageView) findViewById(R.id._full\_image\_view_);
imageView.setImageResource(imageAdapter.thumbImages[position]);
}
 }

image\_details.xml

\&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?\&gt;
 \&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
android:orientation=&quot;vertical&quot; android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot;\&gt;
 \&lt;ImageView android:id=&quot;@+id/full\_image\_view&quot;
android:layout\_width=&quot;match\_parent&quot;
android:layout\_height=&quot;match\_parent&quot; /\&gt;
 \&lt;/LinearLayout\&gt;

**Output**

![](RackMultipart20200420-4-1uy9qe0_html_58dac9fc0b6866c5.png) ![](RackMultipart20200420-4-1uy9qe0_html_f2e883785199803f.png)
```