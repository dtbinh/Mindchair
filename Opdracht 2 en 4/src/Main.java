import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;


/* FOUTE CODE
 * 
         .:IHHMHHI:..,
 .IHHI..IIHMMMMHIHHH:..
 MHHMHHMMMMMMHMMHMHI::,
 IHHHMHMHMHHMMMMMMMMMMH::..:
 MMMMMMMMMHMMMMMMHMMMMMMMMMM:
 MMMMMMMMMMMMMMMHMMMMMMMMMM,:
 MMMMMMMMMMMMMMMMMMMMMMMMMMM,
 MHMHMEMMMMMMMHMMMMHHMMMMMMMM:..
 HMMMMMMHMMMMMMHHMMMMMMMMMMMMM
 MMMMMMMMMHMMHHHI'  '::I HMMMMMI
 MMMHMMMMMMMMMMHHI, '   HIHMMMMMM.
 MMMMMMMMMMMMMMIII,     '':IHMMMM
 MMMMMMMMMHMMMMMMH:      ... HMMM:
 MMMMMMMMMMMMMMMHHH        IMM MH,
 MMMMMMMMMMMMMMMMMI,   ...IMMMMMM
 MMMMHMMMMMMMMMMM      :MIMMI.,
 MMMMMMMHHMMMMMMMM IMMI..  IMMIHH:.
 MMMMMMMHHHHHMMMMIMMH:::... 'IHI,...
 MMMMMMMMMMMMMMM'H:MHIII:...:  ':.:.
 MMMMMHHMMHHMHI ,,MMMII:'::I:I.  :I::
 MMMMMMMMHH....:'''''::.::I,.: MII:
 MMMMMMMMM::.::'''   '':::IH:IM:: IM.
 MMMMMMMMMMII:'' '    ''::I::  :MMMM.
 MMMMMMMMMMII:.        ':I:.,MMMMM':
 MMMMMMMMMHHHII:.     .::I:IIMMM':::
 MMMMMMMMMMMMMII::.. .:II: '::II:''.,:''''::..,
 MMMMMMMMMMMMMMI:::.:I::.. .. ..:'' ,.:'''::,   ':,
 MMMMMMMMMMMHII::'II::....' .:'                   ::.,
 IHIMMMMMMMMMMMMMHI::....::::: :'        ::            '.
  '':HMMMMMMMMMMHHHHHI:..::::II::' .::::::III:,,           ',
       'IHMMMHHHHHHIHIIIIHHHH:    ,'' ::,  .::..         ',
          'MMMHHHHHIIHHHHHHHII: .:::    ::::::::......    ....:,
           MMHHHHHHHIHIIHHIIII  '...''''   '''H:IIHII...    ...',
          .MMHHHHHHHHHHIIIIII':' .....    .:::::II.  'HHH:..    .. ,
         .MMMMMHHHHII::'''  ''       ..     .....:HI:,  II:..  ...::
        ,MHMMMMMHH:.''      ...            ..   ...::H:,  'I::.    .:
       .IMHMMMHI:''     ..:. I       ..    ..    ...::II,  'II....   ::..
       IMHIMMI:''         . :                      ....::H:  I:: .    ...
       MMHIMMI:.''    ..:    ...:            ...      ....II,'I:....    .
      'MMHIMM:'':.    .         .. .     .. ,:           ,.IIHI:::.
      IMIHMMI:::''           .     ,                  .,,  ..::IHIII...
      IMIHMMM.......                .                         ..::HH:..
      HMIHMMMH:.       .                                    ...:::IIHHI.
      IHIMMM::...                                              ''':::::::
      :MMHOM:..  .       ...       I II..... .                     ''':::
      'MIHMMI:...       :::..    .     I. :::::.. ...::....  ..        ''
       MMHMMM:...  ..         .:.....:.III:::.........::::........   ..
       HMIMMI:...         ..:::::::::III:H:IIHII:::::...::::.........
       IMHIMM:.....         ....:::::III:IIIHHHHHHH'III:....:..........
       'MHHMM:...           ....:::::IIIIHMI:':::IHHMHIII:::::...........
        IMIMM:::...            ...:::::III' :....::::IHHMHIIII.::.:......
        'MMIMM:...             ....::I:.'  '      ''''::IIIHMH,':::::::::
         IMHMMI:::....       ,    ..::::::..    .. ...   ..::IHMM:, '':::
          HMMMMH......:  .         ..::::::..            ..::::MMMM)
          IMIMMHH:...:...     ..  ...:::::...   ..  ...  ..:,::MMMI
           HMHMMHI:... ..:.       ....:::::::..:.      ....::::IMM'
           'MMOHHHI:..::...     ....::::II::.::....  ..: ...::IHM'
            IMMHHI:.:::... .      ......::III:..::.::::::..IIHHM'
            'MMMHI:::..::.       ......:IIIHIHII::IHHHHHHHHHI''
             MIMHHHII::..:.    .. ..:::I::.:HHHHIHMMMHMHHIH'
             'MMHHHHII::. ...        ..:.::HHHHHHHMHHMMHI'
              IMMHHIII:::...       .....IHHIIHHIIIHHHHMH
              'MMHHHIII:..:..   ..  ...:HI:...:::IIHHHMH
               IMHHHII::::...       ..IHI..  ..:HHHIHMHH
               'MHHII:::....       ...III:...  .IHHHHMMH
                IMHHHIII::...    ..  ..IHH..  ..:::IHHMH
                'MHHHIIIII:... .    ....II:....:::IHMMHI
                 MHHIIII:::::.        ...:::..:::.HHHHH'
                 'MMHI::::.......       ..:::::.IHHHIHH
                  MMIII::::.......    ....::::::HIIHHH'
                  'MHHHHHII::...         ...:::::MHHHH
                   MHHHHHHIIH::.           .::::HIMMH'
                   HMHHHHHHHHH::..       ....:::HHHHI
                   IMMHHHHHIIII:.    ..   ..::::IHHM'
                   IMMHHHHHHHHHI::.    ..  ..::HMHHH
                   IMHHHHHHHIII::....   ......::HHHI
                   HMHHHHHHIII::''' '   '''''::MHHM'
                  IMMHHHIII::'''            '::HMMM
                 ,HMHHHII::''''         ''''::MMMHM
                IHMHHHHH:''   ''        ''':IHMMMMI
               ,HMHHHHII::.            ''..::MMMMM'
              ,HMHHII::''          ''''':HHHIHMMMM
             ,HMHHI::.              ''::IIIMMHHMMM
           ,IHMMH::''               ..''IHIIMMHMMH
          ,HMHHI:''              ...   .IIIHIMHMHH
         ,HMMI:'          .        ...   ::H MMHHI
        :HMHI:'           ..   ... ....:::. MMMHH'
       IHMHHHI:     .         ...  ....:::::MMHIM
     ,IHMHHHHII::.             .....  ....::::MM'
    ,HMMHHHHII::.                     ....:::MH'
    HMHHHHHHII:::.        ......     ...:::..IM'
   MMMHHHHIII::,             ....::..   ..:::M'
  :MHHHHHIII::'                ....::..:::.:IM'
  MMHHHHHIII::'                ....::::.::IHM'
 ,MIHHHHHHHII.  .                   :::. .:III
 IMIHHHHMMHHII                     ''::::::II:,
 HMIHHMMHHHHH::.                 '' :::IIH::,:,
 MMHHHHHHHII::'                    ''::::::II::,
 HMHHHHHHHHHI:'          ..       ..:   :::::....
 IMMHHHHHHHHH::..                  ...:::::..:II::.
 'MMHHHHHHHHH::::.          ....    ....::::.::I::.,
  IMMIHHHHHHHHHII::.              ....::::::...:::::.
  'MMMHHHHHHHHHHII::.           ...    ........::::::,
   HMMMHHHHHHHHHIIII::.        ....:::.   ....::::..:..
   'HMMMHHHHHHHHHHIII:::.,       ,,:          ...::..:,.
     MMHMMHHHHHHHHIIII::::...      ...:.     ..  ...::::.
     MMHHMMMHHHHHHHHHHHHHI::...                  ......::.
     MMMIHHMMMHHHHHHHHIIIII:::...     ...:             ...:
     MMMMIHMMMMMMHHHMHHHHHHHIIII:::...::            .....::.
     MMMMMIHMMMMHHHHMHHHHMHHH::.I:..          ...      ....:.
     MMMIHHIHHHMMHHHHMMMHHHHHMMHH::.   ...         ....  ..::.
     MMMMHHHIHHHHMHHHHHHMMMHHHHHHIII:::..,         ....  ...::.
     MMMMMIHHHIHMMMMMHHHHHHHHMMHHHHHII::::.:'              ::::.
    :MMMMMIIHHHIHHHMMMMHHHHHHHHHHHHIIII::::.''          ....::::.
    IMMMMHHIIIHHIIHHHHMMMHHHHHHHHIHHHHHII::.         ....  ...:::.
    IMMMHHHIHIIIIIIIHHMMMHHHHHHHHHIIIII:::..                ....:::
    IMMHHHHHI::IIIHHIHHMMMHHHHHHHII::::::.....  .              ...::
    :MMMMHHIII::IHHHHHIHHMMMHHHHHHII:::::..   ..    ,      ...   ..::
    IMMHHHHII:' '' ':HMHHHHMMMHHHHHII:::..::''     .             ..:::
    HMMHHHII::'    :::.HHHHHHMMMHHHHHII::''   ..     ..         ....:::
    HHMHHHH...    ....::HHHMHMMMMMHHHIII:::''..   ...            ....::.
    HMHHHII:''    ''''::IHHMMHMMMMIHHHHHH::.  ....  .  .    ..    ...:::.
    MMHHHI::'    .. ... IHHHHMMMM  'IHHHHII::...... ....            ..:::
    MMMHHH::       '':::HHHHMHMM'    'HHHHI::::::.... .               ..:
    MMMIHI:: :       :,:.MHMHMMM       'HHHH::::..........             .:
    MMMMHIIH:.         ..HHHMMM'        'HMHHHHI::,,,,..          ...
   ,MMMHHH::.    ..   ...:HHMM'           'MMMHHHI:::....  ...         ..
   IMMMMHHH::.     ....:::MMMI              IMMMHHHH:::......  ..
  .HMMMMHHH::...   ..  ..:MMM       ....::II.IIMMMHHHMH::::.......
 MMMMMMMMMHHH::..  ..::HHMMM   ,:IIIHIIII:IIIHHMMMMMMMMHHH:::.. .
 MMMMMMHHHHHIII::.  .:HMMMMM:IIIIH:'''':'':''::::IHMMMMHHHH::........
 MMMMMMMHHIII::''IHHHIIIIIHHHI:''             '':::.IHMMMMMHHHH::.....
 HHHHMMHIIHIIHHHIII::::''''''                   '':::IHMMMMHHMHHI:::...
 IHII''HHHHIII:'::...   ..                      ....  .HHHMMHMMMMHHI::..
 HHHHIII:''''':...     .              .....    :::: .IIHMHHHHHMHHHIMMH:..
 II:'':::..         .         ....::::::: .::::::IIHHIIIHMHHIIIHHHMMMHHII
 ..   .           .          ......::::::::'' IIHHHMHHHHHHHMMMMHHHMMMMMMM
      .....       ........::::::::::III::IIHHHHHHMHHHHHHHMMMMMMMMMMMMMMMM
 .....       ..:  ..:   ......:::::IIHHHHHHHIIIIIHHMMMMMMMMHHMMMMMMHII::'
 ::.    ........::::::::::IIIHHHHHHMMMMMMMMMMHHHHHMMMMMMMMMMHHMII::'''
 :::::::IIIHHHHHHHHHHMMMMMMMMMMMMMMMMMMMHHHHHIIII::'''''''
 IHIHIIHHHHMMMMMMHHIII:::::::::::::'''''''''
 HHHHHHHHHHHHHHHHHHHH'''''''
 HHHIIIIIII''''
 */

public class Main {
	public ColorSensor cs;
	public LightSensor ls;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		cs = new ColorSensor(SensorPort.S2);
		ls = new LightSensor(SensorPort.S1);
		LCD.clear();
		System.out.println("Geef een witte ");
		System.out.println("ondergrond");

		System.out.println("en druk op enter");
		Button.ENTER.waitForPress();
		cs.calibrateHigh();
		ls.calibrateHigh();
		LCD.clear();
		System.out.println("color sensor waarde: " + cs.getHigh());
		System.out.println("light sensor waarde: " + ls.getHigh());
		System.out.println();
		System.out.println("druk op enter om verder te gaan");
		Button.ENTER.waitForPress();
		LCD.clear();

		System.out.println("Geef een zwarte ondergrond");
		System.out.println("en druk op enter");
		Button.ENTER.waitForPress();
		cs.calibrateLow();
		ls.calibrateLow();
		LCD.clear();
		System.out.println("color sensor waarde: " + cs.getLow());
		System.out.println("light sensor waarde: " + ls.getLow());
		System.out.println();
		System.out.println("druk op enter om verder te gaan");
		Button.ENTER.waitForPress();
		new Main();
	}
}
