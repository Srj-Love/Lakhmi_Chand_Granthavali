package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class datacg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datacg);
        switch (getIntent().getStringExtra("id")) {


            case "st27":
                setTitle("1-के सै मेरै गोचरी काम.... ");
                break;

            case "st28":
                setTitle("2-चन्द्रगुप्त तेरा याणा....  ");
                break;
            case "st29":
                setTitle("3-बित गये दिन दो-चार....   ");
                break;

            case "st30":
                setTitle("4-सोचै था मन म्हं....   ");
                break;
            case "st31":
                setTitle("5-चीज मिली ना कई दिन ....   ");
                break;
            case "st32":
                setTitle("6-पुत पराया छोटा दरजा....   ");
                break;
            case "st33":
                setTitle("7- तज कै तमाम काम....   ");
                break;
            case "st34":
                setTitle("8-वो जिनस रही मेरी रै....   ");
                break;
            case "st35":
                setTitle("9-इस लड़के का ढंग बदलदो....");
                break;
            case "st36":
                setTitle("10-बारोठी पै आई सजनों....   ");
                break;
            case "st37":
                setTitle("11-देख कवंर की शान....   ");
                break;
            case "st38":
                setTitle("12-किसी छा रही अजब बहार....   ");
                break;
            case "st39":
                setTitle("13-तेरी सुरत पै कुर्बान....   ");
                break;
            case "st40":
                setTitle("14-आरता हे! आरता....   ");
                break;
            case "st41":
                setTitle("15-तन्यै जोड़ी बर पाया....   ");
                break;
            case "st42":
                setTitle("16-बणियां की चुकड़ात मैं....   ");
                break;
            case "st43":
                setTitle("16-छन पकिया छन पकिया....   ");
                break;
            case "st44":
                setTitle("17-कोए सुणने आळा जीता....   ");
                break;
            case "st45":
                setTitle("18-ले सच्चे मोती का....   ");
                break;
            case "st46":
                setTitle("19-चौड़ै कालर फूट लिया....   ");
                break;
            case "st47":
                setTitle("20-जती मर्द और सती बीर....   ");
                break;
            case "st48":
                setTitle("21-करकै दूर जिगर का धड़का....   ");
                break;
            case "st49":
                setTitle("22-हे! मां राजी हो कै घाल....   ");
                break;
            case "st50":
                setTitle("23-बेटी मेरी आत्मा न्यू ....   ");
                break;
            case "st51":
                setTitle("24-ब्याहली बहू नै लेकै चल्या....  ");
                break;
            case "st52":
                setTitle("25-कथा सुणी जती सती ....   ");
                break;
            case "st53":
                setTitle("24-से सभा के मात पिता....   ");
                break;
            case "st54":
                setTitle("25-दुनियां के सब नर-नार....   ");
                break;
            case "st55":
                setTitle("26-जाण दे हो भूल जा पिया....  ");
                break;
            case "st56":
                setTitle("27-दयावती जननी पै करदी....   ");
                break;
            case "st57":
                setTitle("28-मात-पिता नै पाली जण....   ");
                break;
            case "st58":
                setTitle("29-नफे मै ब्याह करवा लिया....   ");
                break;
            case "st59":
                setTitle("30-दान दिये सांसू-सुसरे नै....   ");
                break;
            case "st60":
                setTitle("31-सास-ससुर बिन ईज्जत....   ");
                break;
            case "st61":
                setTitle("32-हिचकी आई तेरी गोरी याद....   ");
                break;
            case "st62":
                setTitle("33-धर्म पर चालते थे सदा....   ");
                break;
            case "st63":
                setTitle("34-जहाज के मै बैठे-बैठे....   ");
                break;
            case "st64":
                setTitle("35- जहाज पै गया था छोरा....   ");
                break;
            case "st65":
                setTitle("36-आज्या मेरे लाल उरै....   ");
                break;
            case "st66":
                setTitle("37-नफे मै दूणे दाम रहे....   ");
                break;
            case "st67":
                setTitle("38-भली करी थी परमेश्वर....   ");
                break;
            case "st68":
                setTitle("39-ब्याह-शादी का जिकर ....   ");
                break;
            case "st69":
                setTitle("40-गिल्ला मतन्या मानै देवर....   ");
                break;
            case "st70":
                setTitle("41-सुती उठकै देखण लागी....   ");
                break;
            case "st71":
                setTitle("42-खुड़का सुण ल्युंगी सहज-सहज....   ");
                break;
            case "st72":
                setTitle("43-कोड करी तनै रात नै....   ");
                break;
            case "st73":
                setTitle("44-लेकै फकीरी भजन करूंगी....   ");
                break;
            case "st74":
                setTitle("45-मेरी नणदी के बीरा हो....   ");
                break;
            case "st75":
                setTitle("46-मोटी-मोटी आंख कटीली....   ");
                break;
            case "st76":
                setTitle("47-सब सैठा कै साथ सेठाणी....   ");
                break;
            case "st77":
                setTitle("48-जहाज के म्हां बैठ सेठाणी....   ");
                break;
            case "st78":
                setTitle("49-ताराचंद की नजर पड़या....   ");
                break;
            case "st79":
                setTitle("50-जमना जी पै साधू आया....   ");
                break;
            case "st80":
                setTitle("51-कौण गाम शूभ नाम आप....   ");
                break;
            case "st81":
                setTitle("52-ताराचंद कंगाल नाम सै....   ");
                break;
            case "st82":
                setTitle("53-मीठी-मीठी बाणी बोल्या....   ");
                break;
            case "st83":
                setTitle("54-सेठानी न्यू जचगी मेरे ध्यान....   ");
                break;
            case "st84":
                setTitle("55- करते रहे बात दोनूं....   ");
                break;
            case "st85":
                setTitle("56-गऊ-ब्राह्मण साधू की....   ");
                break;
            case "st86":
                setTitle("57-साधु जी के धूणें धौरे....   ");
                break;
            case "st87":
                setTitle("58-एक सोने की मिली कांगणी....   ");
                break;
            case "st88":
                setTitle("59-कांगणी ले आया....   ");
                break;
            case "st89":
                setTitle("60-जां साधू के धूणे धोरै....   ");
                break;
            case "st90":
                setTitle("61-आऐ-गये अतिथि के बदलै....   ");
                break;
            case "st91":
                setTitle("62-घरबारी और साधू का....   ");
                break;
            case "st92":
                setTitle("63-मिले कौली भरकै सेठ जी....   ");
                break;
            case "st93":
                setTitle("64-प्यारा माणस वो हो सै....   ");
                break;
            case "st94":
                setTitle("65-जब सुणी थी सेठ के आवण....   ");
                break;
            case "st95":
                setTitle("66-बालकपण म्य जै खोट बणया....   ");
                break;
            case "st96":
                setTitle("67-कहे सुणें का थूक दे गिल्ला....   ");
                break;
            case "st97":
                setTitle("68-जै चन्द्रगुप्त नै भेजै सै तो....   ");
                break;
            case "st98":
                setTitle("69-दयावती बाहण के आगै....   ");
                break;
            case "st99":
                setTitle("70- माया के फंदे मै फसकै....   ");
                break;
            case "st100":
                setTitle("71- आरता करा ले पिया....   ");
                break;
            case "st101":
                setTitle("72- के टोटे का रोवणां...   ");
                break;


        }
        WebView webView = findViewById(R.id.webView);


        webView.loadUrl("file:///android_asset/" + getIntent().getStringExtra("id") + ".html");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);  }
}
