import tester.*;
class StudentInfo {
    String preferredName, email, majorCode;
    StudentInfo(String preferredName, String email, String majorCode) {
        this.preferredName = preferredName;
        this.email = email;
        this.majorCode = majorCode;
    }
}
class LookupTable<Contents> {
    String[] ids;
    Contents[] contents;
    LookupTable(String[] ids, Contents[] contents) {
        this.ids = ids;
        this.contents = contents;
    }
    Contents find(String id) {
      for(int i = 0; i < this.ids.length; i += 1) {
        if(this.ids[i].equals(id)) {
          return this.contents[i];
        }
      }
      return null;
    }
  }
  class LookupTableExamples {
    void testLookupStudents(Tester t) {
      StudentInfo si1 = new StudentInfo("Bing Thom", "bingthom@alumni.ubc.ca", "SALA");
      StudentInfo si2 = new StudentInfo("Justin Trudeau", "jtrudeau@alumni.ubc.ca", "Education");
      StudentInfo si3 = new StudentInfo("Rick Hansen", "rickhansen@alumni.ubc.ca", "Law");
      StudentInfo[] infos = { si1, si2, si3 };
      String[] pids = {"A123", "A345", "A678"};
      LookupTable<StudentInfo> studentTable = new LookupTable<_______FILL1______>(pids, infos);
      t.checkExpect(studentTable.find("A345"), si2);
      t.checkExpect(studentTable.find("A678"), si3);
      t.checkExpect(studentTable.find("Anonexistent"), null);
    }
    void testLookupClasses(Tester t) {
      String[] sectionIds = {"101", "102", "103", "201"};
      String[] classes = { "CPEN221A", "CPEN221B", "CPEN223", "CPEN212" };
      LookupTable<_____FILL2_____> classTable = new LookupTable<String>(sectionIds, classes);
      t.checkExpect(classTable.find("101"), "CPEN221A");
      t.checkExpect(classTable.find("103"), "CPEN223");
      t.checkExpect(classTable.find("1A1"), null);
    }
  }
