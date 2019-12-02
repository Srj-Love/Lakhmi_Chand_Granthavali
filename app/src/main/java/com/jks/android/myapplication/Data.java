package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        switch (getIntent().getStringExtra("id")) {
            case "csk":
                setTitle("कथासार :—");
                break;
            case "cs1":
                setTitle("1-पांच कदम से मुजरा किन्हा....");
                break;

            case "cs2":
                setTitle("2-होया आनंद कबीला सारा....");
                break;

            case "cs3":
                setTitle("3-एक कै एक गल मै घलरी सै....");
                break;

            case "cs4":
                setTitle("4-न्हां धो कै सिर करवाले.....");
                break;

            case "cs5":
                setTitle("5-हे! री, इसी कौण सै भाई....");
                break;

            case "cs6":
                setTitle("6-जो धन माया लिखी....");
                break;

            case "cs7":
                setTitle("7-सुणता जाईए हो बटेऊ....");
                break;

            case "cs8":
                setTitle("8-माड़ा माड़ा मन क्यूं कर....");
                break;

            case "cs9":
                setTitle("9-सोण-कसौंण हुऐ राह मै.....");
                break;

            case "cs10":
                setTitle("10-झूठा विश्वास पिया....");
                break;

            case "cs11":
                setTitle("11-गांवती-बजांवती ल्यावती.....");
                break;

            case "cs12":
                setTitle("12-कट्ठी होगी लुगाई....");
                break;

            case "cs13":
                setTitle("13-छोटी बड़ी नार मिलकै....");
                break;

            case "cs14":
                setTitle("14-एक बात का रंज सै....");
                break;

            case "cs15":
                setTitle("15-सांस-सुसर और नणंद-पति....");
                break;

            case "cs16":
                setTitle("16-चापसिंह नै हाजिर होणा....");
                break;

            case "cs17":
                setTitle("17-साच बता हो, तेरा माड़ा....");
                break;

            case "cs18":
                setTitle("18-तड़के का इकरार जाण....");
                break;

            case "cs19":
                setTitle("19-छूट्टी के दिन पूरे होगे....");
                break;

            case "cs20":
                setTitle("20-टन्टे-झगड़े करैं भतेरी....");
                break;

            case "cs21":
                setTitle("21-पिया सपने म्य दिखोगे....");
                break;

            case "cs22":
                setTitle("22-जी क्यूकर लागैगा अकेली....");
                break;

            case "cs23":
                setTitle("23-हो भर जा सै तै भरतार....");
                break;
            case "cs24":
                setTitle("24-सुपना तै आया बैरी.....");
                break;
            case "cs25":
                setTitle("25-बिस्तर पर तै चल्या....");
                break;
            case "cs26":
                setTitle("26-लड़का फिकर करै मन-मन....");
                break;
            case "cs27":
                setTitle("27-छ: महीने की कहण सै....");
                break;
            case "cs28":
                setTitle("28-छत्राणी तैं दियो रै मिला....");
                break;
            case "cs29":
                setTitle("29-कर खामोश होश कर दिल.....");
                break;
            case "cs30":
                setTitle("30-हे! मै न्यूं आगी....");
                break;

            case "cs31":
                setTitle("31-सोमवती शुभ नाम मेरा....");
                break;

            case "cs32":
                setTitle("32-सभा मै तिल का सुणा निशान....");
                break;

            case "cs33":
                setTitle("33-मै आरते के जोग, तनै...");
                break;

            case "cs34":
                setTitle("34-ताने मतना मारै, गोरी....");
                break;

            case "cs35":
                setTitle("35-पगड़ी थी रजपूत की....");
                break;

            case "cs36":
                setTitle("36-तनै मेरी लई आबरो....");
                break;

            case "cs37":
                setTitle("37-छ: महीने की कहग्या था....");
                break;

            case "cs38":
                setTitle("38-तू रजपूतां की राणी तेरे....");
                break;

            case "cs39":
                setTitle("39-हे! थारी भाग्यवान की....");
                break;

            case "cs40":
                setTitle("40-सिरकी के मै करै गुजारा....");
                break;

            case "cs41":
                setTitle("41-तेरे तै नाच्या ना जाणे.....");
                break;

            case "cs42":
                setTitle("42-वैं पतिव्रता बीर नही....");
                break;

            case "cs43":
                setTitle("43-दिया गाड सभा म्य बांस....");
                break;

            case "cs44":
                setTitle("44-तनै मेरी लई आबरो डाट....");
                break;

            case "cs45":
                setTitle("45-पिछला कर्म ध्यान....");
                break;

            case "cs46":
                setTitle("46-जाण दे हो भुलज्यां....");
                break;

            case "cs47":
                setTitle("47-फांसी तुडवावै था.....");
                break;



                //Updeshak Bhajan


            case "ub1":
                setTitle("1-ओम भजन बिन जिन्दगी व्यर्था ....");
                break;

            case "ub2":
                setTitle("2-उठो-उठो हे सखी, लागो हरि ....");
                break;

            case "ub3":
                setTitle("3-जिननै ना योग क्रिया का ज्ञान....");
                break;

            case "ub4":
                setTitle("4-पुरूष की मूर्ती पृथ्वी जल ....");
                break;

            case "ub5":
                setTitle("5-पृथ्वी की नदियों मैं उत्तम ....");
                break;

            case "ub6":
                setTitle("6-ये मनुष्य विषय सुख मान कर....");
                break;

            case "ub7":
                setTitle("7-आओ हे मनावैंगे बसन्त सखी ....");
                break;

            case "ub8":
                setTitle("8-जब ब्रह्मचारी शादी करते तीस ....");
                break;

            case "ub9":
                setTitle("9-ऊंच नीच कर सब जीवों ....");
                break;

            case "ub10":
                setTitle("10-धर्मसिंह कै चार चरण थे तीन ....");
                break;

            case "ub11":
                setTitle("11-सब कहण-2 के यार है ....");
                break;

            case "ub12":
                setTitle("12-दई उमर गवा रे खेल के मैं....");
                break;

            case "ub13":
                setTitle("13-चमकै-चमकै री मां बिजली ....");
                break;

            case "ub14":
                setTitle("14-ज्वाला तेरी आश लगी है....");
                break;

            case "ub15":
                setTitle("15-कृष्ण जी अवतार धार के ....");
                break;

            case "ub16":
                setTitle("16-मनुष्य जन्म मुश्किल से ....");
                break;

            case "ub17":
                setTitle("17-हो बर्ण नहीं सकते प्रभु तेरी ....");
                break;

            case "ub18":
                setTitle("18-तनै रचा दिया जग सारा ....");
                break;

            case "ub19":
                setTitle("19-सदा रे दिन नहीं बराबर ....");
                break;

            case "ub20":
                setTitle("20-मेट मेरी भूल मनशा देवी तूं....");
                break;

            case "ub21":
                setTitle("21-अष्ट वसु और ग्यारा रूद्र ....");
                break;

            case "ub22":
                setTitle("22-करैंगे तै बोही जा के हाथ ....");
                break;

            case "ub23":
                setTitle("23-लाख चौरासी खत्म हुए ना बीत ....");
                break;

            case "ub24":
                setTitle("24-जगत सै रैन का सपना रै ....");
                break;

            case "ub25":
                setTitle("25-मर्द व्यवाहरी नै सरता कोन्यां ....");
                break;

            case "ub26":
                setTitle("26-इसी भक्तिनी हरीचरण की ....");
                break;

            case "ub27":
                setTitle("27-भूल गये रंग रास....");
                break;

            case "ub28":
                setTitle("28-वे नर हुए निधि तै पार....");
                break;

            case "ub29":
                setTitle("29-जिननै करी दगा की कार....");
                break;

            case "ub30":
                setTitle("30-भजन बिन बन्दे काम नहीं ....");
                break;

            case "ub31":
                setTitle(" 31-नर सोच समझ कै चाल.... ");
                break;

            case "ub32":
                setTitle(" 32-हे त्रिलाकी भगवान पार तनैं .... ");
                break;

            case "ub33":
                setTitle(" 33-मौत भूख का एक पिता है .... ");
                break;

            case "ub34":
                setTitle(" 34-लोक सम्पूर्ण लख अपणे .... ");
                break;

            case "ub35":
                setTitle(" 35-मानज्याू  मन बेईमान पछतावैगा.... ");
                break;

            case "ub36":
                setTitle(" 36-बन्दे करले भजन हरी का दिल .... ");
                break;

            case "ub37":
                setTitle("  37-नर करले भजन राम का उमर ....");
                break;

            case "ub38":
                setTitle(" 38-कृष्ण जी महाराज आज्या.... ");
                break;

            case "ub39":
                setTitle(" 39-दो का साल महीना आसौज .... ");
                break;

            case "ub40":
                setTitle(" 40-दो का साल महीना आसौज .... ");
                break;

            case "ub41":
                setTitle("41-जड़ चेतन में व्यापक है तूं ....");
                break;

            case "ub42":
                setTitle("42-आईए री आईए-2 तेरे भक्त....");
                break;

            case "ub43":
                setTitle("43-देवी कारज सारिए री ....");
                break;

            case "ub44":
                setTitle("44-श्री लखमीचन्द मनुष्य ना थे....");
                break;

            case "ub45":
                setTitle("45-कुटिल कुचलना एबदार नर ....");
                break;
            case "ub46":
                setTitle("46-तू भी चलै नै म्हारे साथ गऊ ....");
                break;

            case "ub47":
                setTitle("47-गऊ माता की सेवा करियो ....");
                break;

            case "ub48":
                setTitle("48-आडै परिन्दा  भी ना फटैक ....");
                break;

            case "ub49":
                setTitle("49-म्हारा भारत खो दिया फर्क ....");
                break;

            case "ub50":
                setTitle("50-हे बन्दे तू ओस का पानी....");
                break;

            case "ub51":
                setTitle("51-फर्क नै खो दिए जी बन्दे ....");
                break;
            case "ub52":
                setTitle("52-इस मोह तृष्णा के बस मैं या ....");
                break;
            case "ub53":
                setTitle("53-निर्गुण है अलख नाम सगुण ....");
                break;
            case "ub54":
                setTitle("54-सजनों बेरा ना के चाला रै....");
                break;
            case "ub55":
                setTitle("55-अकलबन्द इस दुनियां के ....");
                break;
            case "ub56":
                setTitle("56-प्रभु तेरी कुदरत से सब बन ....");
                break;
            case "ub57":
                setTitle("57-सै जिन्दगी दिन चार होज्या ....");
                break;
            case "ub58":
                setTitle("58-परम हंस और शुकर स्वरूप ....");
                break;
            case "ub59":
                setTitle("59-बालक छोडे़ रोवते चाकी ....");
                break;
            case "ub60":
                setTitle("60-मनुष्य जन्म ले करकै हरी गुण ....");
                break;
            case "ub61":
                setTitle("61-विश्वास तेरा कृष्ण जी हो नन्द ....");
                break;
            case "ub62":
                setTitle("62-गंगा जी निस्तारैगी मनै ....");
                break;
            case "ub63":
                setTitle("63-तुम गाओ राग मलाहर हे ....");
                break;
            case "ub64":
                setTitle("64-रंग-रंग के बणे मकान कोए ....");
                break;
            case "ub65":
                setTitle("65-रै छत्री भूप बली बलवान मरगे ....");
                break;
            case "ub66":
                setTitle("66-रै बन्दे तेरै भूल लागरी तेरा ...");
                break;
            case "ub67":
                setTitle("67-हैं सब बन्दे मेरे त्रिलोकी तेरे ....");
                break;
            case "ub68":
                setTitle("68-माटी के मै माटी मिलगी ....");
                break;
            case "ub69":
                setTitle("69-जीते जी का मेल मरे पै किसका ...");
                break;
            case "ub70":
                setTitle("70-सबके काम समारण आले....");
                break;



                      //हीर रांझा



















                //मीरा बाई


            case "mb1":
                setTitle("1-एक सति का ब्यान....");
                break;
            case "mb2":
                setTitle("2-मैं भी चलूंगी तेरे साथ....");
                break;
            case "mb3":
                setTitle("3-न्यू तै बतादे माता मेरी री....");
                break;
            case "mb4":
                setTitle("4-बन्धन काट मुरारी यम....");
                break;
            case "mb5":
                setTitle("5-मीराबाई प्रभु जी थारे....");
                break;
            case "mb6":
                setTitle("6-उठो उठो हे सखी लगो....");
                break;
            case "mb7":
                setTitle("7-आइयो री लुगाइयो गाइयो....");
                break;
            case "mb8":
                setTitle("8-तेरी सूरत पै कुर्बान हो....");
                break;
            case "mb9":
                setTitle("9-कृष्ण मुरारी म्हारी....");
                break;
            case "mb10":
                setTitle("10-सासरै गई थी हे चम्पा सासू.....");
                break;
            case "mb11":
                setTitle("11-आया करती याद जब .....");
                break;
            case "mb12":
                setTitle("12-मेरा ध्यान पती, मेरी .....");
                break;
            case "mb13":
                setTitle("13-थारे रटे तै इस दुनिया .....");
                break;
            case "mb14":
                setTitle("14-एक ठिकाणैं मनचित करकै .....");
                break;
            case "mb15":
                setTitle("15-जितणी सखी सब प्रेम की .....");
                break;
            case "mb16":
                setTitle("16-कौण मृग मारण रे त्यातर .....");
                break;
            case "mb17":
                setTitle("17-भूलगे हथियार दोनों मीरां .....");
                break;
            case "mb18":
                setTitle("18-दो नयनों के तीर चलैं .....");
                break;
            case "mb19":
                setTitle("19-जिसकै बेटी घरां श्याणी .....");
                break;
            case "mb20":
                setTitle("20-श्याणी बेटी घरां कंवारी .....");
                break;
            case "mb21":
                setTitle("21-उदयपुर तै चिट्ठी आगी ....");
                break;
            case "mb22":
                setTitle("22-कुछ डर ना सै पिया ....");
                break;
            case "mb23":
                setTitle("23-मीरा का भी कुछ ध्यान ....");
                break;
            case "mb24":
                setTitle("24-बीरां आला चाल चलण ना....");
                break;
            case "mb25":
                setTitle("25-मीरा आज्याच बान बैठले ....");
                break;
            case "mb26":
                setTitle("26-मीराबाई ब्याह करवाले ....");
                break;
            case "mb27":
                setTitle("27-ब्या ह शादी की नहीं ....");
                break;
            case "mb28":
                setTitle("28-मीराबाई नाम हूर का ....");
                break;
            case "mb29":
                setTitle("29-मात पिता नै धर्म छोड़ दिया ....");
                break;
            case "mb30":
                setTitle("30-मीरा दासी भगवन की री .....");
                break;
            case "mb31":
                setTitle("31-मेरी पिया जी के चरणन मै .....");
                break;
            case "mb32":
                setTitle("32-बेटा कर पाली बेटी.....");
                break;
            case "mb33":
                setTitle("33-पल्ला ठाकै देखण लाग्या .....");
                break;
            case "mb34":
                setTitle("34-म्हारे घर तै ठा लाया.....");
                break;
            case "mb35":
                setTitle("35-दुनियां में रूके रोले की .....");
                break;
            case "mb36":
                setTitle("36-बड़ी उमर की मात बराबर .....");
                break;
            case "mb37":
                setTitle("37-मेरा तेरे में हित सै गोरी.....");
                break;
            case "mb38":
                setTitle("38-बरतणी पडै सैं रीत दुनियां .....");
                break;
            case "mb39":
                setTitle("39-रै बस टाल करो बतलावण .....");
                break;
            case "mb40":
                setTitle("40-आओ सखी आओ सखी आओ .....");
                break;
            case "mb41":
                setTitle("41-नई बहू नै ब्याह चाले में सौ .....");
                break;
            case "mb42":
                setTitle("42-रेत के मैं रलरी मीरा जाणूं.....");
                break;
            case "mb43":
                setTitle("43-सत का संग असत्य का त्यागन.....");
                break;
            case "mb44":
                setTitle("44-तेरी आश मै खड़ी सैं मीरा .....");
                break;
            case "mb45":
                setTitle("45-सब तै कहूं सूं समझाकै कदे .....");
                break;
            case "mb46":
                setTitle("46-एक बर्तन में पाणी भरकै.....");
                break;
            case "mb47":
                setTitle("47-बेशक तै सिर काट लिए .....");
                break;
            case "mb48":
                setTitle("48-भाई पणे का नेग छोड़.....");
                break;

            case "mb49":
                setTitle("49-इसी भक्तिनी हरीचरण की .....");
                break;
            case "mb50":
                setTitle("50-अर्जी लिख के तेरे नाम .....");
                break;



                //Seth Tarachand

            case "st1":
                setTitle("1-कहै पत्नी उठ बैठ पति....");
                break;

            case "st2":
                setTitle("2-मच्या सै जगत में शोर....");
                break;

            case "st3":
                setTitle("3-दान-पुन्न खर्चे खाये बिन....");
                break;

            case "st4":
                setTitle("4-झूठ-कपट छल बेईमानी मैं....");
                break;

            case "st5":
                setTitle("5-पहलम ढीली धोती करली....   ");
                break;

            case "st6":
                setTitle("6-मत कर खर्च फिजुल....  ");
                break;

            case "st7":
                setTitle("7-फर्क होया, सेठ जी के दिल....   ");
                break;

            case "st8":
                setTitle("8-प्रदेशां तै चिट्ठी आई.... ");
                break;

            case "st9":
                setTitle("9-मुश्किल बचाणी पिया शर्म-हया....   ");
                break;

            case "st10":
                setTitle("10-हो क्यों रोवण लागे जी....   ");
                break;

            case "st11":
                setTitle("11-लिखा कर्मों में ऐसा....  ");
                break;
            case "st12":
                setTitle("12-सै बणियें की जात पिया....  ");
                break;

            case "st13":
                setTitle("13-चन्द्रगुप्त इकलोता बेटा....  ");
                break;

            case "st14":
                setTitle("14-करकै दूर जिगर के धड़के ....  ");
                break;

            case "st15":
                setTitle("15-सेठ आवता नजर पड़या रै....  ");
                break;

            case "st16":
                setTitle("16-मंशा सेठ स्वर्ग केसा धाम....  ");
                break;

            case "st17":
                setTitle("17-एक चीज सै अनमोल....  ");
                break;

            case "st18":
                setTitle("18-सुणै तै सुणाऊं तन्यै जिकर....  ");
                break;
            case "st19":
                setTitle("19-लड़का तै ना लेणा चहिए....  ");
                break;

            case "st20":
                setTitle("20-ताराचन्द नै सौप दिया....  ");
                break;

            case "st21":
                setTitle("21-दो सौ रूपए खाण का भोजन....  ");
                break;
            case "st22":
                setTitle("22-मेरे गल गली दुख विपता फांसी....  ");
                break;
            case "st23":
                setTitle("23-कदे कदे धन जोड़ जोड़....  ");
                break;
            case "st24":
                setTitle("24-गऊ ब्राह्मण साधु की....  ");
                break;
            case "st25":
                setTitle("25-उन्नीस कर्म मनुष मात्र के....  ");
                break;
            case "st26":
                setTitle("26-सेठ पणे की बात याद....  ");
                break;

                //Sahilakadhara

            case "sl1":
                setTitle(" 1-बेईमान होगे रै! गोरी.... ");
                break;
            case "sl2":
                setTitle(" 2-आज तेरी किसतै होगी खटपट.... ");
                break;
            case "sl3":
                setTitle("3-बात सै थोड़े से अरसां....  ");
                break;
            case "sl4":
                setTitle("4-पिया जाणदे, बस राहण....  ");
                break;
            case "sl5":
                setTitle("5-मैं तनै भेद बतादूं जड़....    ");
                break;
            case "sl6":
                setTitle("6-ऋषि मेरी माड़ी सै ....    ");
                break;
            case "sl7":
                setTitle("7-सिर पै भरोटा धर लिया....    ");
                break;
            case "sl8":
                setTitle("8-तूं दिये खोल शरीर की तिस....    ");
                break;
            case "sl9":
                setTitle("9-मै बणखंड म्य विपत भरूं....    ");
                break;
            case "sl10":
                setTitle("10-दुख म्य बीतै जिन्दगी....    ");
                break;

            case "sl11":
                setTitle("11-नित आया कर, हंस....      ");
                break;

            case "sl12":
                setTitle("12-बेमारी नै यें घर घाले....      ");
                break;

            case "sl13":
                setTitle("13-रुपाणी कै ताप चढया....      ");
                break;
            case "sl14":
                setTitle("14-माणस की के पार बसावै....      ");
                break;
            case "sl15":
                setTitle("15-माणस की के पार बसावै....      ");
                break;
            case "sl16":
                setTitle("16-कागज मैं सिर मारै ....      ");
                break;
            case "sl17":
                setTitle("17-सारी सखियां बोलैं चालैं....      ");
                break;
            case "sl18":
                setTitle("18-है तेरे दिल बिगड़न की ....      ");
                break;
            case "sl19":
                setTitle("19-आओ हे! सखी सब ....      ");
                break;
            case "sl20":
                setTitle("20-मै दुखिया फिरूं सूं कंगाल....      ");
                break;
            case "sl21":
                setTitle("21-मेरे यार जनाने महलां ....      ");
                break;
            case "sl22":
                setTitle("22-मेरा नाम नहीं, कोए ....      ");
                break;
            case "sl23":
                setTitle("23-जीवती रही तै फेर मिलैंगी....      ");
                break;
            case "sl24":
                setTitle("24-हंस-फिरे बिना, तेरा ....      ");
                break;
            case "sl25":
                setTitle("25-गरीब आदमी निर्धन बन्दा....      ");
                break;
            case "sl26":
                setTitle("26-स्याही घालो, बदन सजा ....      ");
                break;
            case "sl27":
                setTitle("27-दुर्गे सब के काज सारती....      ");
                break;
            case "sl28":
                setTitle("28-तेरे वर के लायक नहीं ....      ");
                break;
            case "sl29":
                setTitle("29-मेरी प्यारी नारी, कुवारी....      ");
                break;
            case "sl30":
                setTitle("30-तनै कोड करी, दिये....      ");
                break;
            case "sl31":
                setTitle(" 31-अरे! तेगा लेकै रे पापी....     ");
                break;
            case "sl32":
                setTitle(" 32-तू सुणती नहीं गरीब ....     ");
                break;
            case "sl33":
                setTitle(" 33-चन्द्रमा सी प्यारी लागै....     ");
                break;
            case "sl34":
                setTitle("34-करकै याद राज के सुख नै....      ");
                break;
            case "sl35":
                setTitle("35-मत चालै मेरी गैल....      ");
                break;
            case "sl36":
                setTitle("36-हो पिया भीड़ पड़ी मैं नार....      ");
                break;
            case "sl37":
                setTitle("37-मत साथ चलै....      ");
                break;
            case "sl38":
                setTitle(" 38-जै किसे राजकंवर कै होती तै....     ");
                break;
            case "sl39":
                setTitle("39-और क्याहें का नहीं गरूर....      ");
                break;
            case "sl40":
                setTitle("40- रै! सुण राजा रायसिंह की....      ");
                break;

            case "sl41":
            setTitle(" 41-सारस केसी जोट....        ");
            break;

            case "sl42":
                setTitle(" 42-हो बैठज्याा कुटी मैं....        ");
                break;
            case "sl43":
                setTitle("43-ब्या ह तै होया पर होगी दुखी ....         ");
                break;
            case "sl44":
                setTitle(" 44-दिन तै पहलां उठ कै....        ");
                break;
            case "sl45":
                setTitle("45-तेरा जंगल म्य अस्थान....         ");
                break;
            case "sl46":
                setTitle(" 46-बण की लकड़ी तोड़कै....        ");
                break;
            case "sl47":
                setTitle(" 47-बीना बोली शीश झुकाकै....        ");
                break;
            case "sl48":
                setTitle(" 48-एक बर तै हृदय सा हाल्या....        ");
                break;
            case "sl49":
                setTitle("49-इब दाम हाथ म्य होगे रै....         ");
                break;
            case "sl50":
                setTitle("50-तज फूलझड़ी नै राही टोहली....         ");
                break;
            case "sl51":
                setTitle("51-लकड़ी ल्याते रै! लालाजी....         ");
                break;
            case "sl52":
                setTitle(" 52-तनै कदे ना सोची आपतै....        ");
                break;
            case "sl53":
                setTitle("53-मेरे धोरे तै गोरी....         ");
                break;
            case "sl54":
                setTitle("54-मैं राजा राय सिंह की बेटी....         ");
                break;
            case "sl55":
                setTitle("55-मा\u200Dत-पिता हों जन्मो देण क....         ");
                break;
            case "sl56":
                setTitle("56-हे! प्रभू तेरी कुदरत से....         ");
                break;
            case "sl57":
                setTitle("57-ब्रह्म रूप भगवान जोत ....         ");
                break;
            case "sl58":
                setTitle("58-चले न्हाण मर्द और बीर....         ");
                break;
            case "sl59":
                setTitle("59-सजन मेरे कर्मां करकै बात....         ");
                break;
            case "sl60":
                setTitle("60-अस्नान करो कुछ ध्यान ....         ");
                break;

            case "sl61":
                setTitle("61-ढके-ढकाये ढोल धरे ....          ");
                break;
            case "sl62":
                setTitle(" 62-विजय सिंह बेईमान की....         ");
                break;
            case "sl63":
                setTitle("63-चुपकी रहै मत कड़वी ....          ");
                break;
            case "sl64":
                setTitle(" 64-इबकै दुखी करोगे ज्यादा....         ");
                break;
            case "sl65":
                setTitle("65-चोर-जार लुच्चे डाकू....          ");
                break;
            case "sl66":
                setTitle("66-एक की दारु दो बतलाई....          ");
                break;
            case "sl67":
                setTitle("67-मत कुमति करो, अधर्म से....          ");
                break;
            case "sl68":
                setTitle("68-मनै मतन्या खींचो ताड़ो रै! ....          ");
                break;

            case "sl69":
                setTitle("69-बात मेरी परचे में लिख ले....          ");
                break;

            case "sl70":
                setTitle("70-दया करो गोरी धन म्हारे पै....          ");
                break;

            case "sl71":
                setTitle("71-मेरे आये ना भरतार ....          ");
                break;

            case "sl72":
                setTitle("72-करड़ाई नै सजन हमारे....          ");
                break;

            case "sl73":
                setTitle("73-गंगा जी के खोले के ....          ");
                break;

            case "sl74":
                setTitle("74-हे! श्री ठाकुर की सूं....          ");
                break;

            case "sl75":
                setTitle("75-चली बिचारी, बीना प्यारी....          ");
                break;

            case "sl76":
                setTitle("76-हे! रै भौरे मै पड़कै....          ");
                break;

            case "sl77":
                setTitle("77-कौण जनानी सी बोली बोलै....          ");
                break;

            case "sl78":
                setTitle("78-तड़फ कै मरूंगा इस कारागार....          ");
                break;

            case "sl79":
                setTitle("79-माता नै बणवास टोह लिया ....          ");
                break;

            case "sl80":
                setTitle("80- हे! मेरे प्रेम गात मै जागै....          ");
                break;

            case "sl81":
                setTitle("81-परवाना छाती कै ला ....          ");
                break;



            case "cp1":
                setTitle("1-आपस के बैर विवाद से कोये .... ");
                break;
            case "cp2":
                setTitle("2-खेलें थे कपटी शुकनी ....   ");
                break;

            case "cp3":
                setTitle("3-अरै किसा दरबार में जूऐ ....  ");
                break;

            case "cp4":
                setTitle("4-पृतकामी दूत बुलाया ....   ");
                break;

            case "cp5":
                setTitle("5-माता कोरवों नै छुटा दिया ....   ");
                break;

            case "cp6":
                setTitle("6-चलकै पृतकामी दूत ....   ");
                break;
            case "cp7":
                setTitle("7-कौरवों का सख्त हुक्म ....   ");
                break;
            case "cp8":
                setTitle("8-सतपुरुषों कै न्याय होया करैं ....   ");
                break;
            case "cp9":
                setTitle("9-के कुछ लाया रे जवाब ....   ");
                break;
            case "cp10":
                setTitle("10-शेरां गेल्यां शेर लड़ा करैं....   ");
                break;
            case "cp11":
                setTitle("11-जीत लिए जूए मैं पांडों ....   ");
                break;
            case "cp12":
                setTitle("12-सुनकै दासी के नाम को ....   ");
                break;
            case "cp13":
                setTitle("13-आण कै करलेगी आप सवाल....   ");
                break;
            case "cp14":
                setTitle("14-कह शुकनी, दुशाषन केसा....   ");
                break;
            case "cp15":
                setTitle("15-मेरे मैं ये गुण नीच पणे का....   ");
                break;
            case "cp16":
                setTitle("16-उसके हार जीत की बात....   ");
                break;
            case "cp17":
                setTitle("17-ला कै ठीक तरहां अन्दाजा....   ");
                break;
            case "cp18":
                setTitle("18-यो तै मेरा देवर दुशासन सै....   ");
                break;
            case "cp19":
                setTitle("19-षट दुशासन नै आण कै....   ");
                break;
            case "cp20":
                setTitle("20-मेरी सासू सभा मै जां सू री....   ");
                break;
            case "cp21":
                setTitle("21-अरे थारी मरदां की कचहैरी ....   ");
                break;
            case "cp22":
                setTitle("22-चंडाली की तरह बिगड़....   ");
                break;
            case "cp23":
                setTitle("23-उड़ै बैठे गुरु समान ....   ");
                break;
            case "cp24":
                setTitle("24-कर्ण की बातां पै भाई धर  ....   ");
                break;
            case "cp25":
                setTitle("25-वो काले मुंह आला दिया ....   ");
                break;
            case "cp26":
                setTitle("26-कहण लग्या राणी तै खोटी....   ");
                break;
            case "cp27":
                setTitle("27-एक अर्ज मेरी, कर जोड़....   ");
                break;
            case "cp28":
                setTitle("28-हाथ जोड़ कै अर्ज करी सुणियों  ....   ");
                break;
            case "cp29":
                setTitle("29-चुप चाप शान्ति हो रही....   ");
                break;
            case "cp30":
                setTitle("30-आंसू भरे नैन देखे द्रोपद ....   ");
                break;
            case "cp31":
                setTitle("31-काम नहीं था बोलण का....   ");
                break;
            case "cp32":
                setTitle("32-थारा के जीवै बलवान दुखी  ....   ");
                break;
            case "cp33":
                setTitle("33-जो राजा जूआ खेल ना सकते....   ");
                break;
            case "cp34":
                setTitle("34-भरी सभा के बीच तुमनै ....   ");
                break;
            case "cp35":
                setTitle("35-लगे तुम उल्टी रीत चलावण....   ");
                break;
            case "cp36":
                setTitle("36-धनवान पितम हुए बिना ....   ");
                break;
            case "cp37":
                setTitle("37-शुभ राजनीति पछाण कै....   ");
                break;
            case "cp38":
                setTitle("38-सब सुनते रहो, अक्षर-2 चुनते ....   ");
                break;
            case "cp39":
                setTitle("39-रखियो रखियो जी....   ");
                break;
            case "cp40":
                setTitle("40-कर जोड़ खड़ी सूं, प्रभु....   ");
                break;




            case "kp1":
                setTitle("1-तेरे देश नगर का तोल ना  ....   ");
                break;
            case "kp2":
                setTitle("2-मैं दासी द्रोपद नार की....   ");
                break;

            case "kp3":
                setTitle("3-या परदे आली नार....   ");
                break;

            case "kp4":
                setTitle("4-साच बतादे दासी आई ....   ");
                break;

            case "kp5":
                setTitle("5-शालन्द्री सै इसका नाम  ....   ");
                break;

            case "kp6":
                setTitle("6-सुण मां के जाये भाई....  ");
                break;
            case "kp7":
                setTitle("7-वोहे उसका राम जिसमैं ....   ");
                break;
            case "kp8":
                setTitle("8-सुख चाहती हो तै ल्या  ....   ");
                break;
            case "kp9":
                setTitle("9-देख तेरा दुख दासी पण ....   ");
                break;
            case "kp10":
                setTitle("10-इसने काढ़ महल तै बहार ....   ");
                break;
            case "kp11":
                setTitle("11-शिवजी के वरदान से इसके ....   ");
                break;
            case "kp12":
                setTitle("12-मतना मारै कीचक मेरै बोलां  ....   ");
                break;
            case "kp13":
                setTitle("13-पांच पति गन्धर्व सै मेरे....   ");
                break;
            case "kp14":
                setTitle("14-बहना बस लण दे भाई ....   ");
                break;
            case "kp15":
                setTitle("15-श्यान थी सवाई जाणूं....   ");
                break;
            case "kp16":
                setTitle("16-मदिरा की बोतल ल्यां ....   ");
                break;
            case "kp17":
                setTitle("17-आडै़ चाहे कितणिऐ टहल कराले....   ");
                break;
            case "kp18":
                setTitle("18-बोतल ले ली हाथ मैं....   ");
                break;
            case "kp19":
                setTitle("19-भीम बली बिन पाप कटै ....   ");
                break;
            case "kp20":
                setTitle("20-तेरा सुण लूंगा सब हाल ....   ");
                break;
            case "kp21":
                setTitle("21-बाहरणै खड़ी क्यूं ....   ");
                break;
            case "kp22":
                setTitle("22-मात पिता की जगह समझकै  ....   ");
                break;
            case "kp23":
                setTitle("23-करकै प्यार बुलाई थी आ  ....   ");
                break;
            case "kp24":
                setTitle("24-दासी करणा हो सो करले ....   ");
                break;
            case "kp25":
                setTitle("25-धन्य भाग आज तू म्हारै आगी ....   ");
                break;
            case "kp26":
                setTitle("26-आज तै आगै इस महल नै....   ");
                break;
            case "kp27":
                setTitle("27-मैं मरया तेरे दर्द का मारया....   ");
                break;
            case "kp28":
                setTitle("28-रै खुश हो कै  मुखड़ा धोले....   ");
                break;
            case "kp29":
                setTitle("29-कीचक होज्यकगा नुक्सामन हाथ ....   ");
                break;
            case "kp30":
                setTitle("30-अग्नि के तुल जाण ले तू इस ....   ");
                break;
            case "kp31":
                setTitle("31-कीचक कुछ ख्याल करै नै ....   ");
                break;
            case "kp32":
                setTitle("32- तेरी के श्रद्धा सै बोलण की ....   ");
                break;
            case "kp33":
                setTitle("33-राजा नै प्रजा तकणी चाहिए....   ");
                break;




            case "nt1":
                setTitle("1-लक्ष्मी रूप बीर का घर ....     ");
                break;

            case "nt2":
                setTitle("2-कहरी सूं कुछ तेरे भले ....     ");
                break;
            case "nt3":
                setTitle("3-हे गिरकाणी मेरा छोटा देवर ....     ");
                break;
            case "nt4":
                setTitle(" 4-तनै तै सेठाणी म्हारे ....    ");
                break;
            case "nt5":
                setTitle("5-मेरी ले लिए दया री ....     ");
                break;
            case "nt6":
                setTitle("6-तेरे पाणी नै मारली ....     ");
                break;
            case "nt7":
                setTitle("7-लडूगीं ना भिडूंगी, पडूंगी ....     ");
                break;
            case "nt8":
                setTitle(" 8-सुण-2 कै नै तेरे बोल ....    ");
                break;
            case "nt9":
                setTitle("9-पाणी नै तू नाटी री भाभी....     ");
                break;
            case "nt10":
                setTitle("10-तेरी भाभी लागै सै नेग ...   ");
                break;
            case "nt11":
                setTitle(" 11-भाइयों बहू बिराणी पै के ....    ");
                break;
            case "nt12":
                setTitle("12-तेरे पाणी नै काढ़ी जले इतणी ....     ");
                break;
            case "nt13":
                setTitle(" 13-भाभी मत बोलै कड़वे-2 बोल....    ");
                break;
            case "nt14":
                setTitle("14-मेरी भाभी देवर कह कै कदे ....     ");
                break;
            case "nt15":
                setTitle(" 15-कर भरले, डर मरले, सिर ....    ");
                break;
            case "nt16":
                setTitle("16-मेरा करदे माफ कसूर, कहै ....     ");
                break;
            case "nt17":
                setTitle("17-पता नहीं था नौंटकी हर ....     ");
                break;
            case "nt18":
                setTitle("18-मनैं जा लेने दे मत  ....     ");
                break;
            case "nt19":
                setTitle("19-हट तेरा के पाणी पीवैंगे तू ....     ");
                break;
            case "nt20":
                setTitle("20-लाड प्यार माटी में मिलगे इब....     ");
                break;
            case "nt21":
                setTitle("21-मेरे भाई, मेरे सिर पै चढ़गी ....     ");
                break;
            case "nt22":
                setTitle("22-तेरा भाई सै बदमाश आंवते ही  ....     ");
                break;
            case "nt23":
                setTitle("23-तनै के सोची बदमाश फूलसिंह ....     ");
                break;
            case "nt24":
                setTitle("24-अरै बीर के गुलाम घणां ....     ");
                break;
            case "nt25":
                setTitle("25-मेरे तै के बान्धया जा सै ....     ");
                break;
            case "nt26":
                setTitle("26-तुम दोनू भाई रहो महल  ....     ");
                break;
            case "nt27":
                setTitle(" 27-हो जै जागा प्रदेश जले रो ....    ");
                break;
            case "nt28":
                setTitle("28-मेरी जात बिगाड़ी रै मेरे भाई  ....     ");
                break;
            case "nt29":
                setTitle("29-उस बैरण नै काढ दिया ....     ");
                break;
            case "nt30":
                setTitle("30-म्हारे घरक्यां तै हुई लड़ाई रै....     ");
                break;
            case "nt31":
                setTitle("31-बैरण होगी रै बड़े भाई ....     ");
                break;
            case "nt32":
                setTitle("32-जाणा नौटंकी के देश ....     ");
                break;
            case "nt33":
                setTitle("33-लई मुलतान शहर की राही....     ");
                break;
            case "nt34":
                setTitle("34-कित बसै रै शहर मुलतान जमाने ....     ");
                break;
            case "nt35":
                setTitle("35-चढ़ा आलकस काया के ....     ");
                break;
            case "nt36":
                setTitle("36-चोर जार लुच्चे डाकू का ....     ");
                break;
            case "nt37":
                setTitle("37-प्रदेशी नै शरण लई थारी ....     ");
                break;
            case "nt38":
                setTitle("38-काम पड़या ना बाग मैं ....     ");
                break;
            case "nt39":
                setTitle("39-मैं प्रदेशी घणी दूर का....     ");
                break;
            case "nt40":
                setTitle("40- बाग जनाना ठहर ना सकते ....     ");
                break;
            case "nt41":
                setTitle("41-न्यू सोची थी छत्री नैं निभा ....     ");
                break;
            case "nt42":
                setTitle("42-रोटी तै टुकड़ा री मालिण ....     ");
                break;
            case "nt43":
                setTitle("43-आया था मैं ठहरण खातिर....     ");
                break;
            case "nt44":
                setTitle("44-पहरा कै नै हार दे दिये ....     ");
                break;
            case "nt45":
                setTitle("45-कहियो री उस नौटंकी गोरी ....     ");
                break;
            case "nt46":
                setTitle("46-चाल पड़ी, चाल पड़ी....     ");
                break;
            case "nt47":
                setTitle("47-हे तेरा हार गजब की ....     ");
                break;
            case "nt48":
                setTitle("48-आंगली मत तोड़ छोरी ....     ");
                break;
            case "nt49":
                setTitle("49-मालिण ल्यारदे मनैं समान ....     ");
                break;
            case "nt50":
                setTitle("50-मींह बरसण नै होरया सै ....     ");
                break;
            case "nt51":
                setTitle("51-मैं मरी रे बटेऊ लोग....     ");
                break;
            case "nt52":
                setTitle("52-इसमैं के धर्म बिगड़ता तेरा ....     ");
                break;
            case "nt53":
                setTitle("53-कदे भरम बात का फूटज्यां री....     ");
                break;
            case "nt54":
                setTitle("54-मालिण तेरा दर्द मिटाऊंगा....     ");
                break;
            case "nt55":
                setTitle("55-कंवर नै झट गहने का ....     ");
                break;
            case "nt56":
                setTitle("56-क्यों मालिण मेरा धर्म बिगाड़ै....     ");
                break;
            case "nt57":
                setTitle("57-मिलण बुलाई आई देर मैं बहू....     ");
                break;
            case "nt58":
                setTitle("58-आनन्द होंण लगे काया ....     ");
                break;
            case "nt59":
                setTitle("59-मिश्री में रस आया करै ....     ");
                break;
            case "nt60":
                setTitle("60-क्या तारीफ करूं जोबन की....     ");
                break;
            case "nt61":
                setTitle("61-खोलते हें किवाड़....     ");
                break;
            case "nt62":
                setTitle("62-झुकज्याख रे बदला पिया जी ....     ");
                break;
            case "nt63":
                setTitle("63-मनैं बालक छोड़े रोवते ....     ");
                break;
            case "nt64":
                setTitle("64-तेरे रूप का इसा चान्दडणा जाणूं....     ");
                break;
            case "nt65":
                setTitle("65-हे मेरा बालम दुखड़ा पावैगा ....     ");
                break;
            case "nt66":
                setTitle("66-तू कहरी सै मर्द बणन की....    ");
                break;
            case "nt67":
                setTitle("67-प्रदेशी नै मरवा कै तेरै कै ....     ");
                break;
            case "nt68":
                setTitle("68-इसी करै भगवान महारे मैं  ....     ");
                break;
            case "nt69":
                setTitle("69-सदा तै मैं कै छुरा सै....     ");
                break;




            case "pd1":
                setTitle("1-दिन लिकड़या पीली पटी ....    ");
                break;

            case "pd2":
                setTitle("2-पांच सात ढंग दूर एकला ....    ");
                break;
            case "pd3":
                setTitle("3-सुण चन्द्रदत्त मेरे यार ....    ");
                break;
            case "pd4":
                setTitle("4-गया बैठ पलंग पै जाकै....    ");
                break;
            case "pd5":
                setTitle("5-किसनै महल बणाया सै ....    ");
                break;
            case "pd6":
                setTitle("6-नींद में बीती रात तमाम ....    ");
                break;
            case "pd7":
                setTitle("7-नहाण चलैंगी सारी साथ हे....    ");
                break;
            case "pd8":
                setTitle("8-कटठी होकै न्हाण चलैंगी....    ");
                break;
            case "pd9":
                setTitle("9-के बोली, न्यूै बोली....    ");
                break;
            case "pd10":
                setTitle("10-सारे काम फतह होज्यांंगे...  ");
                break;

            case "pd11":
                setTitle("11-थारा जंगल मैं के काम ....    ");
                break;

            case "pd12":
                setTitle("12-कहे बोल दर्द के हो....    ");
                break;

            case "pd13":
                setTitle("13-तला जनाने न्यारे आली....    ");
                break;

            case "pd14":
                setTitle("14-जोट गई एक तीसरी की ....    ");
                break;

            case "pd15":
                setTitle("15-पद्मावत सुणले तै कहदूं ....    ");
                break;

            case "pd16":
                setTitle("16-जब सुणा सखी का बोल ....    ");
                break;

            case "pd17":
                setTitle("17-मरे बिनाखोट, हुए लोटपोट....    ");
                break;

            case "pd18":
                setTitle("18-हे घर नै चाल्या कोन्यां जाता....    ");
                break;

            case "pd19":
                setTitle("19-जैसे नाचै उरवशी राजा इन्द्र ....    ");
                break;

            case "pd20":
                setTitle("20-थी इन्द्र की हूर मुख से बरसै ....    ");
                break;

            case "pd21":
                setTitle("21-इबकै बचग्या तै बज्जर केसा....    ");
                break;

            case "pd22":
                setTitle("22-दुनियां के ढंग बहुत देख ....    ");
                break;

            case "pd23":
                setTitle("23-उस गोरी तै चलकै मुलाहजा ....    ");
                break;

            case "pd24":
                setTitle("24-ज्ञान बहुत सा रूप गजब ....    ");
                break;

            case "pd25":
                setTitle("25-ले तेरी मुट्ठी गर्म करू ....    ");
                break;

            case "pd26":
                setTitle("26-अरी हम दो बन्दे परदेशी ....    ");
                break;

            case "pd27":
                setTitle("27-बाग जनाना ठहर ना सकते ....    ");
                break;

            case "pd28":
                setTitle("28-जिन्दगी में जल पिया नहीं....    ");
                break;

            case "pd29":
                setTitle("29-आंख कसूती काढ़ी आड़ी....    ");
                break;

            case "pd30":
                setTitle("30-पिछला कर्म ध्यान में ल्यादे ....    ");
                break;

            case "pd31":
                setTitle("31-त्यारी करी सिंगार की मेरी ....    ");
                break;

            case "pd32":
                setTitle("32-ये मारैंगे फूल हमनैं....    ");
                break;

            case "pd33":
                setTitle("33-मेरा मन मोह लिया हुर परी नै....    ");
                break;

            case "pd34":
                setTitle("34-एक नया मुसाफिर आया....    ");
                break;

            case "pd35":
                setTitle("35-तीन रोज हो लिए तड़पती ....    ");
                break;


            case "pd36":
                setTitle("36-हे मेरा व्याकुल हुया शरीर ....    ");
                break;

            case "pd37":
                setTitle("37-हे तू जिसकी मारी फिरै ....    ");
                break;

            case "pd38":
                setTitle("38-झूली गाई नहीं मनैं दुख ....    ");
                break;

            case "pd39":
                setTitle("39-परण तोड कै ब्याह करवाले ....    ");
                break;

            case "pd40":
                setTitle("40-मत छेड़ो मनैं पड़ी रहाण ....    ");
                break;

            case "pd41":
                setTitle("41-चमकै चमकै री बिजली ....      ");
                break;

            case "pd42":
                setTitle("42-तनै किस कारण बुलवा लिया....      ");
                break;


            case "pd43":
                setTitle(" 43-हे मैं मरगी इस परदेशी नै ....     ");
                break;
            case "pd44":
                setTitle("44-जुणसी खाण पीण की चीज ....      ");
                break;
            case "pd45":
                setTitle("45-लाख टके का हे मां मेरी ....      ");
                break;
            case "pd46":
                setTitle("46-रल मिल कै तीजन में डोलै....      ");
                break;
            case "pd47":
                setTitle("47-हालती ना चालती घालती ....      ");
                break;
            case "pd48":
                setTitle(" 48-परदेशी की श्यान देख कै ....     ");
                break;
            case "pd49":
                setTitle("49-क्यों आसण पाटी लेएं ....      ");
                break;
            case "pd50":
                setTitle("50-धन भाग आज घर आया....      ");
                break;

            case "pd51":
                setTitle("51-भूल ज्यागा पता जिला ....      ");
                break;
            case "pd52":
                setTitle("52-तू बेटी सै किस बाप की रै ....      ");
                break;

            case "pd53":
                setTitle("53-ये सोज्यां जब मैं जागूं ....      ");
                break;

            case "pd54":
                setTitle("54-बुझै कड़े का घर गाम नै ....      ");
                break;
            case "pd55":
                setTitle("55-रहाण दयो हे जाण दो तुम ....      ");
                break;

            case "pd56":
                setTitle("56-सहम मरण नै होरी ....      ");
                break;

            case "pd57":
                setTitle("57-तू मरती कदे यो मरता थारी ....      ");
                break;

            case "pd58":
                setTitle("58-इबकै फेर इशारा करगी ....      ");
                break;

            case "pd59":
                setTitle("59-तेरा ठीक सौण सै यार ....      ");
                break;

            case "pd60":
                setTitle("    ");
                break;

            case "pd61":
                setTitle("61-चन्द्रदत्त की आज्ञा ले कै ....      ");
                break;
            case "pd62":
                setTitle(" 62-सोवै थी अपणी मौज मैं....     ");
                break;
            case "pd63":
                setTitle("63-आशिक होग्या खड़या ....      ");
                break;


            case "pd64":
                setTitle("64-सोवै सै के बैठी हो लिए रै  ....      ");
                break;



            case "cd1":
                setTitle("1-फोटू चीज दुकान में दुनिया ....      ");
                break;

            case "cd2":
                setTitle("2-कागज की तस्वीर कड़े तै ....      ");
                break;

            case "cd3":
                setTitle("3-छत्रधारी राजा भूल में....      ");
                break;

            case "cd4":
                setTitle("4-चीज मिली सै लहणे आली.....    ");
                break;

            case "cd5":
                setTitle("5-या कागज पै कौण कड़े....      ");
                break;

            case "cd6":
                setTitle("6-इसनै परे सी हटाले हो यो ....      ");
                break;


            case "cd7":
                setTitle("7-फोटू दियासिलाई नै....      ");
                break;

            case "cd8":
                setTitle("8-तनै के सोची निरभाग ....      ");
                break;

            case "cd9":
                setTitle("9-राहणदे क्यूं घणी मिलावै ....  .    ");
                break;

            case "cd10":
                setTitle("10-हुर का चन्दकिरण सै नाम...    ");
                break;

            case "cd11":
                setTitle("11-दीन से बेदीन हुआ....  .    ");
                break;
            case "cd12":
                setTitle("12-मैं पूरा सूं पैज परण का....      ");
                break;
            case "cd13":
                setTitle("13-बाबा जी मेरे कान पाड़ले ....  \"    ");
                break;
            case "cd14":
                setTitle("14-समझ गया तेरी बात नै....      ");
                break;
            case "cd15":
                setTitle("15-मदनसैन, बाबा के आगै ....      ");
                break;
            case "cd16":
                setTitle("16-मनै बतादे बाबा जी तेरे ....      ");
                break;
            case "cd17":
                setTitle(" 17-इश्क विषय में रोंए जांगा ....     ");
                break;
            case "cd18":
                setTitle("18-दोनुवां में तै एक काम कर ....      ");
                break;
            case "cd19":
                setTitle("19-देख्यां चन्दाकिरण का महल....      ");
                break;
            case "cd20":
                setTitle("20-मेरे दुख सुख की जाणैं ....      ");
                break;


            case "cd21":
                setTitle("21-हो बाबाजी धूणां ठाले....     ");
                break;

            case "cd22":
                setTitle("22-बाबाजी जाइये ऊठ....     ");
                break;
            case "cd23":
                setTitle("23-धूणां ठाले हो बाबा जी, ....     ");
                break;
            case "cd24":
                setTitle("24-जा उस चन्दकिरण तैं कहदे....  .   ");
                break;
            case "cd25":
                setTitle("25-मैं क्यों भांजी मारूं थारे ...   ");
                break;
            case "cd26":
                setTitle("26-बिराणे माणस मरवावण का ....     ");
                break;
            case "cd27":
                setTitle("27-री कदे तलै आणं पडै ना ....     ");
                break;
            case "cd28":
                setTitle("28-बान्दी हो कै ठाडू ....     ");
                break;
            case "cd29":
                setTitle("29-सोवै सै के डाण अटारी मैं....  .   ");
                break;
            case "cd30":
                setTitle(" 30-बाबाजी की श्यान देख कै ....    ");
                break;
            case "cd31":
                setTitle("31-अरै बान्दी हम नै भी सुण ....     ");
                break;

            case "cd32":
                setTitle("32-हे मैं मरगी, इस बाबा जी  ....     ");
                break;

            case "cd33":
                setTitle("33-बोली रै, बोली रै, कौण या ....     ");
                break;

            case "cd34":
                setTitle("34-करणी ना ठीक लड़ाई हे....     ");
                break;

            case "cd35":
                setTitle("35-जीवती गुण भूलूं ना तेरा....     ");
                break;

            case "cd36":
                setTitle("36-मरवा कै पति बिराणा....     ");
                break;

            case "cd37":
                setTitle("37-मेरी बाजै बीन गलियारे ....     ");
                break;

            case "cd38":
                setTitle("38-इसी बजाई बीन सपेले ....     ");
                break;

            case "cd39":
                setTitle("39-भूप तेरे दरबार बुलाले....     ");
                break;

            case "cd40":
                setTitle("40-ईनाम देण की खातिर ....     ");
                break;

            case "cd41":
                setTitle("41-इस बाबा जी के साथ बिठा ....     ");
                break;

            case "cd42":
                setTitle("42-तीन वचन मनैं भर राखे ....     ");
                break;

            case "cd43":
                setTitle("43-अनर्थ करवावै सै रै क्यूं ....     ");
                break;
            case "cd44":
                setTitle("44-आगै डोला जब चालैगा ...   ");
                break;
            case "cd45":
                setTitle("45-एक मर्द संग दो बीरां की ....     ");
                break;
            case "cd46":
                setTitle("46-ले चालै तै साथ मैं, फेर ....     ");
                break;

            case "jk1":
                setTitle("1-तख्ती का मज़बून पढ़या ....       ");
                break;

            case "jk2":
                setTitle("2-तखती मिली जवाबी रै जब ....       ");
                break;
            case "jk3":
                setTitle("3-कोए दुखी कोए सुखी जगत ....       ");
                break;
            case "jk4":
                setTitle("4-तार कै नै धरदे सारे ....       ");
                break;
            case "jk5":
                setTitle("5-भूर मेव का बेटा चोर ...     ");
                break;
            case "jk6":
                setTitle("6-डयोढ़ी ऊपर नजर गई ....       ");
                break;
            case "jk7":
                setTitle("7-ज्यानी के बारे मैं बीड़ा....       ");
                break;
            case "jk8":
                setTitle(" 8-ठण्डी-ठण्डी हवा चलै....      ");
                break;
            case "jk9":
                setTitle("9-लड़का देखै था बाग मैं ....  .     ");
                break;
            case "jk10":
                setTitle("10-बुरा बदी नै त्यागै कोन्यां....       ");
                break;


            case "jk11":
                setTitle(" 11-चमन में खुश्बोई का काम ....  .   ");
                break;
            case "jk12":
                setTitle(" 12-ईज्जत नै क्यूं तारै सै री ...   ");
                break;

            case "jk13":
                setTitle("13-री हटज्याू नैं दूर पापण....      ");
                break;

            case "jk14":
                setTitle(" 14-क्यों सिर पै चढ़गी डाण....     ");
                break;
            case "jk15":
                setTitle("15-तेरा किसनै बणा दिया बाग...    ");
                break;
            case "jk16":
                setTitle("16-मालण लई भुगत भतेरी ....      ");
                break;
            case "jk17":
                setTitle("17-मौसा बैरी बारयां मैं काट ...    ");
                break;
            case "jk18":
                setTitle("18-जब ठहरूंगा तेरे पास मैं....      ");
                break;
            case "jk19":
                setTitle("19-नक्शा नया तार कै चाल्या....      ");
                break;
            case "jk20":
                setTitle("20-हुए सुख कम कसरे....      ");
                break;

            case "jk21":
                setTitle(" 21-राशी जन्म बखाणू सूं री....     ");
                break;

            case "jk22":
                setTitle("22-देख ली पत्रे की बाणी....      ");
                break;
            case "jk23":
                setTitle("23-ओ किमैं भरी जवानी ....      ");
                break;
            case "jk24":
                setTitle(" 24-पत्रा खोल लिया दिल साफ ....     ");
                break;
            case "jk25":
                setTitle(" 25-लिया रूप तीसरा धार...   ");
                break;
            case "jk26":
                setTitle("26-उड़ै ज्यानी आग्या धमल ....      ");
                break;
            case "jk27":
                setTitle("27-हे मां बाहर बटेऊ की ढाल....      ");
                break;
            case "jk28":
                setTitle("28-कितै कुए में डूब क्यों ....      ");
                break;
            case "jk29":
                setTitle(" 29-कितने दिन तनै हो ....     ");
                break;
            case "jk30":
                setTitle("30-चाल्या मैं तीर्थ करण गया था....     ");
                break;
            case "jk31":
                setTitle("31-तेरे बिन माली हो....      ");
                break;
            case "jk32":
                setTitle("32-आज तै मैं लडूंगी घणी....      ");
                break;
            case "jk33":
                setTitle("33-अरै मेरै दो मुट्ठी भरदे....      ");
                break;
            case "jk34":
                setTitle(" 34-हो तेरे मरण जीण का ....     ");
                break;
            case "jk35":
                setTitle("35-छलिया बणया छबीली सी ...    ");
                break;
            case "jk36":
                setTitle(" 36-उसनै भो कोए तकले ...  ");
                break;
            case "jk37":
                setTitle("37-बेवारिश की ढाल फिरै....      ");
                break;
            case "jk38":
                setTitle(" 38-तनै जगह बतावै थानेदार ....     ");
                break;
            case "jk39":
                setTitle("39-अकल दरोगा की मारी ....      ");
                break;
            case "jk40":
                setTitle("40-भेष जनाना देख लिया मैं ....      ");
                break;

            case "jk41":
                setTitle(" 41-तनै मेरा धर्म बिगाड़ा....     ");
                break;
            case "jk42":
                setTitle("42-तेरी मूछ और डाढी काटली अदली....      ");
                break;


            case "hr1":
                setTitle("1-उठ खड्या हो रांझे पाली ....   ");
                break;
            case "hr2":
                setTitle("2-करकै प्यार बुलाले घर पै ....   ");
                break;
            case "hr3":
                setTitle("3-के तनै पहले ना देखी थी ....   ");
                break;
            case "hr4":
                setTitle("4-आधी रात अन्धेरी में कित ....   ");
                break;

            case "hr5":
                setTitle("5-आगे तै हटज्याे भाभी इब मन....   ");
                break;

            case "hr6":
                setTitle("6-तेरे प्रेम की मारी मरगी हीर ....   ");
                break;
            case "hr7":
                setTitle("7-जिसतै प्यार करया करता ....   ");
                break;
            case "hr8":
                setTitle("8-मैं पाली वा घर आली न्यूं ....   ");
                break;
            case "hr9":
                setTitle("9-अब तक सुता ना उठ्या ....  . ");
                break;

            case "hr10":
                setTitle("10-जाणूं था मैं जिसी तनै ....   ");
                break;

            case "hr11":
                setTitle("11-एक रत्ती भर खोट नहीं सै ....  . ");
                break;
            case "hr12":
                setTitle("12-परसों तक हीरे आज्यागी तेरे ....   ");
                break;
            case "hr13":
                setTitle("13-करकै प्यार बुलाया था ....   ");
                break;
            case "hr14":
                setTitle("14-एक बै डोला रोकले....   ");
                break;

            case "hr15":
                setTitle("15-मतना फिकर करै पाली मैं ... ");
                break;
            case "hr16":
                setTitle("16-एक बै डोला रोकले ....   ");
                break;
            case "hr17":
                setTitle("17-के बुझै सै मन की....   ");
                break;
            case "hr18":
                setTitle("18-तेरे डोले के आगै गिरग्या परी....   ");
                break;

            case "hr19":
                setTitle(" 19-सिंहणी नै लेग्या श्याल एक ....  ");
                break;
            case "hr20":
                setTitle("20-दुनिया के मैं सौदा हो अपणी ....   ");
                break;

            case "hr21":
                setTitle("21-देख लई तू हीर पात्यर ....   ");
                break;
            case "hr22":
                setTitle("22-कान पड़ा लिए मोडा होग्या ....   ");
                break;
            case "hr23":
                setTitle("23-दुनियां के मैं हो सै मोल ....     ");
                break;
            case "hr24":
                setTitle("24-सखी भरण चली जल नीर ....     ");
                break;
            case "hr25":
                setTitle("25-मैं आग्या थारे कुएं पै ....     ");
                break;
            case "hr26":
                setTitle("26-क्यूं ले ली तनै फकीरी हो....   ");
                break;
            case "hr27":
                setTitle(" 27-किसी सुथरी श्यान का....  ");
                break;
            case "hr28":
                setTitle("28-कहो तनै पाणी क्यूं  ना प्यावैंगी....     ");
                break;
            case "hr29":
                setTitle("29-मनै प्रेम हीर का खोग्या.... ");
                break;
            case "hr30":
                setTitle("30-देखी थी एक बीर बानी....   ");
                break;
            case "hr31":
                setTitle("31-लुगाईयो री मनैं न्यू तै बताईयो ....   ");
                break;
            case "hr32":
                setTitle("32-धोखे ठाली मेरी चीज ....   ");
                break;
            case "hr33":
                setTitle("33-मरवाकै पूत बिराणा....   ");
                break;
            case "hr34":
                setTitle("34-चल दिया रांझा पीर अटखेड़ां....   ");
                break;
            case "hr35":
                setTitle("35-सतगुर कर लिए मोडे बणगे ....   ");
                break;
            case "hr36":
                setTitle("36-सुलफा तै बाबा जी में पिया ....   ");
                break;
            case "hr37":
                setTitle("37-आश्की  नै बड़े -बड़या के ....   ");
                break;
            case "hr38":
                setTitle("38-सेती चाली हीर नै देई ....   ");
                break;
            case "hr39":
                setTitle("39-कैसे आती है धुणे पर चढ़ी....   ");
                break;
            case "hr40":
                setTitle("40-डाट नीम की ला राखी सै ....     ");
                break;
            case "hr41":
                setTitle("41-मेरी भाभी कै विषयर लड़ग्या ....     ");
                break;
            case "hr42":
                setTitle("42-कद लों ठहरै बतादे साच ....     ");
                break;
            case "hr43":
                setTitle("43-अरे नणद,  तेरी देरी सै ....   ");
                break;






















            default:
                setTitle("पंडित लख्मीचंद ग्रंथावाली");
        }
        WebView webView = findViewById(R.id.webView);


        webView.loadUrl("file:///android_asset/" + getIntent().getStringExtra("id") + ".html");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);




    }
}
