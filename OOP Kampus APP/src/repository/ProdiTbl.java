// membuat kelas baru untuk melakukan operasi pada data program studi yaitu get dan create
package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.createProdi(prodi);
    }

    public Prodi getProdiById(String id) {
        return db.getProdiById(id);
    }
}
