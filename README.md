# API Transaksi (Tes Magang PT Inovasi Daya Solusi)

## 🚀 Fitur

* Menyediakan *endpoint* `GET` tunggal untuk mengambil data.
* Mengembalikan respons JSON terstruktur yang menggabungkan data transaksi dan data master status.
* Menggunakan database MySQL relasional untuk menyimpan data.
* Sepenuhnya dapat dijalankan dalam satu perintah menggunakan Docker Compose (termasuk pembuatan dan pengisian data database).

## 🛠️ Teknologi yang Digunakan

* **Java 21**
* **Spring Boot**
* **MySQL**
* **Maven**
* **Docker**

---

## 🏃‍♂️ Cara Menjalankan
**Menggunakan Docker Compose**

**Requirement:**
* **Docker Desktop**


**Langkah-langkah:**

1.  **Clone repository ini ke folder yang diinginkan.**

2.  **Buat File `.env` (Sangat Penting)**
    Buat file baru di folder utama proyek (technical.api) bernama `.env`. File ini digunakan untuk menyimpan *password* database dengan aman.
    Isi file `.env` dengan:
    ```
    DB_PASSWORD=root
    ```
    *(Anda bisa ganti `root` dengan password apa pun yang Anda inginkan untuk database Docker Anda)*

3.  **Jalankan Docker Compose:**
    Buka terminal di folder proyek dan jalankan:
    ```bash
    docker-compose up --build
    ```

4.  **Akses API:**
    Setelah kedua *container* berjalan, buka browser Anda di:
    **`http://localhost:8080/api/viewdata`**
      ]
    }
    ```
