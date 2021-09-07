using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ESMSV3_1.ServiceReference1;

namespace ESMSV3_1
{
    class Program
    {
        static void Main(string[] args)
        {

            user user1 = new user();
            user1.username = "XXXXX";
            user1.password = "XXXXXX";


            EnterpriseSMSWSClient client = new EnterpriseSMSWSClient();
            Console.WriteLine(client.serviceTest(user1));

            //create the session
            session session1 = new session();
            session1 = client.createSession(user1);

            Console.WriteLine(session1.isActive);


            // Create list of recipients
            var myList = new List<string>();

            // Add items to the list
           
            myList.Add("071XXXXXX");
            myList.Add("071XXXXX");

             /* smsMessage messages = new smsMessage();
              messages.message = "Testmobi";
              messages.sender = "Religious";
              messages.recipients = myList.ToArray();
              messages.messageType = 1;

              Console.WriteLine(client.sendMessages(session1, messages));*/

            //multi language message
            smsMessageMultiLang msgMulti = new smsMessageMultiLang();
            msgMulti.message = "This is test multiLanguage message நல்ல";
            msgMulti.sender= "Religious";
            msgMulti.recipients= myList.ToArray();
            msgMulti.messageType = 1;

            Console.WriteLine(client.sendMessagesMultiLang(session1, msgMulti));

            /*try
            {
                smsMessage[] array = client.getMessagesFromLongNumber(session1, "94712011920");

                if (array.Length > 0)
                {

                    foreach (smsMessage num in array)
                    {

                        Console.WriteLine(num.message);
                        Console.WriteLine(num.sender);
                        Console.WriteLine(num.recipients);

                    }

                }
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine(ex.Message);
                Console.WriteLine("Null list for this session");


            }*/

/*

            Console.WriteLine("Receiving...");
            smsMessage[] msgs = client.getMessagesFromShortcode(session1, "246");
            if (msgs != null)
            {
                Console.WriteLine("#msgs: " + msgs.Length);
                for (int i = 0; i < msgs.Length; i++)
                {
                    Console.WriteLine(msgs[i].message);
                }
            }
            else
            {
                Console.WriteLine("No msgs");
            }

    */
            client.closeSession(session1);
            Console.ReadKey();

        }
    }
}
