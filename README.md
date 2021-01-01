# javada-sahte-json
Authentication

<p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/75476607/103444169-0abe6080-4c77-11eb-83c6-5f30d9942173.png">
</p>



![image](https://user-images.githubusercontent.com/75476607/103443753-50792a00-4c73-11eb-9a15-18ed1fd6181f.png)
![image](https://user-images.githubusercontent.com/75476607/103443774-74d50680-4c73-11eb-953c-689253744b0d.png)
![image](https://user-images.githubusercontent.com/75476607/103443792-9504c580-4c73-11eb-8848-7cac1484ca4d.png)
![image](https://user-images.githubusercontent.com/75476607/103443797-9d5d0080-4c73-11eb-9382-31f7b505bf19.png)
![image](https://user-images.githubusercontent.com/75476607/103443804-a948c280-4c73-11eb-99c0-1ae491976149.png)
![image](https://user-images.githubusercontent.com/75476607/103443815-b1086700-4c73-11eb-8c2c-203ab89c9b3c.png)
![image](https://user-images.githubusercontent.com/75476607/103443824-c2517380-4c73-11eb-83f8-b0486cbe4af6.png)
![image](https://user-images.githubusercontent.com/75476607/103443829-c8475480-4c73-11eb-8c2c-64bc81596cee.png)
![image](https://user-images.githubusercontent.com/75476607/103443835-d1d0bc80-4c73-11eb-88e7-6a47b76473d2.png)
![image](https://user-images.githubusercontent.com/75476607/103443842-d85f3400-4c73-11eb-9d9a-058b9503dd4a.png)





`public static void wait(int salise){

        try{
            Thread.sleep(salise);
        }
        catch(InterruptedException e){
    
        }
  
}` 
<b>wait nedir ? Wait:  süre bazında beklemesini sağlar normalde java da Thread.sleep(salise) şeklinde kullanılmaktadır fakat kısa yol olması için custom wait olarak ayarlanmıştır kullanımı şu şekildedir: wait(salise)*</b>

`public static void time(){
SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
Date date = new Date(System.currentTimeMillis());
sendMessageWithoutClear("Date:"+formatter.format(date));
}`

<b> time nedir ? Time: SimpleDateFormat ile yapılan custom bir fonksiyondur. neden SimpleDateFormat değil de sadece time ?
daha kısa ve istenileni vermesi için ayarlanmıştır. SimpleDateFormat içindeki y - m - d nedir ? Ingilizcesi : Year Month ve Day demektir Türkçe karşılığı nedir ? Türkçe de yıl ay gün demektir. HH:MM:SS nedir ? Ingilizcesi: Hour Minute Second.. Türkçe karşılığı nedir ? Türkçe de saat dakika saniye veya salisedir. 
</b>

`public static void sendMessageWithoutClear(String msj){

    System.out.println(msj);
}
`

<b>sendMessageWithoutClear nedir ? sendMessageWithoutClear: custom olarak temizleme olmadan mesaj gönderilmesi için yapılmıştır. Java'da ki gösterimi ise şu şekildedir: System.out.printIn(string or int..);
</b>

`public static void sendMessage(String msj){
    clearScreen();
    System.out.println(msj);
}
`
<b>sendMessage nedir ? sendMessage: custom olarak  temizle ile birlikte mesaj gönderilmesi için yapılmıştır. Java'da ki gösterimi ise şu şekildedir: System.out.printIn(string or int..);
</b>



Not: Sınıf Arkadaşlarım ve kendim için paylaştım.
 
