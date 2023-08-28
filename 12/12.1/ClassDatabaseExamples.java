import tester.*;
class ClassDatabase {
  String[] sectionIds;
  ________[] classTitles;
  ClassDatabase(String[] sectionIds, _________[] classTitles) {
    this.sectionIds = sectionIds;
    this.classTitles = classTitles;
  }
  _________ find(String sectionId) {
    for(int i = 0; i < this.sectionIds.length; i += 1) {
      if(this.sectionIds[i].equals(sectionId)) {
        return this.classTitles[i];
      }
    }
    return null;
  }
}
class ClassDatabaseExamples {
  void testLookupClasses(Tester t) {
    String[] sectionIds = {"101", "102", "103", "201"};
    String[] classes = { "CPEN221A", "CPEN221B", "CPEN223", "CPEN212" };
    ClassDatabase classTable = new ClassDatabase(sectionIds, classes);
    t.checkExpect(classTable.find("101"), "CPEN221A");
    t.checkExpect(classTable.find("103"), "CPEN223");
    t.checkExpect(classTable.find("1A1"), null);
  }
}
