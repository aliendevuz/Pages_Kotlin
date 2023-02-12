package com.example.pageskotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.adapter.PostAdapter
import com.example.pageskotlin.model.Post

class PostFragment : Fragment() {
    private lateinit var list: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_post, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        val posts: ArrayList<Post> = ArrayList()
        load(posts)
        val adapter = PostAdapter(posts)
        val layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)
        layoutManager.stackFromEnd = true
        list = view.findViewById(R.id.post_list)
        list.layoutManager = layoutManager
        list.adapter = adapter
    }

    private fun load(posts: ArrayList<Post>) {
        val header = "PDP Academy"
        var text: String = """
               Sovuq havo dasturlashni o’rganishga halaqit berishiga yo’l qo’ymang
               
               Pdp.uz dasturlashni qulay sharoitda o’rganishingizga yordam beradi
               
               Batafsil ma'lumot uchun:
               📞 78-777-47-47
               
               📥 Ro'yxatdan o'tish uchun: 
               @PDPSupportBot
               """.trimIndent()
        posts.add(Post(header, R.drawable.post1, text))
        text =
            """🌐 Dasturlashga qiziqqan yoshlarni "Nega dasturchi bo'lishim kerak?" deb nomlangan bepul master-klassga taklif qilamiz

Master-klassda:

- Dasturlashning bugungi kundagi ahamiyati
- Dasturlashdagi yo'nalishlar va ularning bir-biridan farqi
- PDP rahbaridan info-speech 
- IT sohasiga oid qiziq ma'lumotlar
- Kompyuterga va turli texnik qurilmalarga to'g'ridan-to'g'ri kod yozib dastur tuzish jarayonida jonli ishtirok etish imkoniyati
- "Foundation" o'quv-dasturi va uning dasturlashga ilk  qadam qo'yayotgan yoshlar uchun ahamiyati haqida kerakli ma'lumotlar sizni kutmoqda.

❄️ Anomal sovuqga qaramasdan ish qizg'in bo'ladigan zamonaviy kasb - dasturlashni o'rganishning ayni vaqti! 

📆 21-yanvar, 16:00

Batafsil ma'lumot uchun:
📞 78-777-47-47

📥 Ro'yxatdan o'tish uchun: 
@PDPSupportBot"""
        posts.add(Post(header, R.drawable.post2, text))
        text =
            """
               Ovozli chatimizga qo’shiling, dasturlashga qiziquvchuvchilar uchun muhim savollarga javoblar topamiz.
               
               - Dasturlashni mustaqil o’rganish mumkinmi?
               - Qaysi dasturlash tillarini o’rgangan ma’qul?
               - Qanday qilib ko’proq va tezroq tajriba yig’ish mumkin kabi aktual mavzularda suhbatlashamiz. 
               
               Qo’shiling, chat bugun 20:00 shu yerda (Telegram kanalimizda) bo’lib o’tadi
               
               """.trimIndent()
        posts.add(Post(header, R.drawable.post3, text))
        text =
            """
               Toptal senior dasturchisi Farruh Atabekov bilan 1-fevral kuni Toptal va frilansing haqida suhbatlashamiz.
               
               Uchrashuvda:  
               - Frilanser dasturchi bo’lishning qandaydir noqulayliklari bormi?
               – Toptalda ishlash uchun qanday hard va soft skillarga ega bo’lish lozim?
               - Toptalda ishlash dasturchiga qanday tajriba va bilimlar beradi? kabi savollarga javoblar olishingiz mumkin. 
               
               ⚡️ Kirish bepul
               
               📆 1-fevral
               ⏰ 18:30
               
               Batafsil ma'lumot uchun:
               📞 78-777-47-47
               
               📥 Ro'yxatdan o'tish uchun: @PDPSupportBot
               """.trimIndent()
        posts.add(Post(header, R.drawable.post4, text))
        text =
            """
               Ovozli chatimizga qo’shiling, dasturlashga qiziquvchuvchilarning muhim savollariga javob beramiz.
               
               - Dasturlashni mustaqil o’rganish mumkinmi?
               - Qaysi dasturlash tillarini o’rgangan ma’qul?
               - Qanday qilib ko’proq va tezroq tajriba yig’ish mumkin kabi aktual mavzularda suhbatlashamiz. 
               
               Ovozli chat 3-fevral 20:00 Telegram kanalimizda bo’lib o’tadi
               
               ➕ Qo’shiling
               
               """.trimIndent()
        posts.add(Post(header, R.drawable.post5, text))
        text = """
               Shaxsiy kiber xavfsizligingizni kuchaytirish uchun 7 tavsiya
               
               1. Dasturiy ta’minotni so’nggi yangilanishda bo’lishiga e’tiborli bo’ling
               2. Kompyuterda ishonchli anti-virusdan foydalaning
               3. Doim kuchli (murakkab) parollardan foydalaning
               4. Ikki va ko’p bosqichli himoyani yoqib qo’ying, bugungi kunda ko’plab servis va dasturlarda bu funksiya mavjud
               5. Sms va pochta orqali keladigan shubhali linklarni ochmang
               6. Smarftoningiz himoyasiga ham e’tiborliroq bo’ling, murakkabroq parol ishlating
               7. Ma’lumotlaringizni bulutli servislarda saqlang
               
               """.trimIndent()
        posts.add(Post(header, R.drawable.post6, text))
    }
}
