# TrackerAir.java

### Tujuan Program
Program ini dibuat untuk membantu pengguna mengecek apakah konsumsi air hariannya sudah cukup atau justru berlebihan. Tujuan utamanya adalah  untuk meningkatkan kesadaran akan pentingnya hidrasi yang seimbang.

### Jenis Exception yang Digunakan
Program menggunakan exception `IllegalArgumentException` dari Java untuk menangani dua kondisi:
- Konsumsi air kurang dari 1.5 liter → dianggap kekurangan
- Konsumsi air lebih dari 5 liter → dianggap berlebihan

Jika kondisi tersebut terjadi, program akan berhenti dan menampilkan pesan error melalui stack trace, menyerupai tampilan error Java asli seperti pada debugging biasa.
