# name-sorter
SDLC Breakdown for This Task
1. Requirement Analysis
    . Input
    . Output
    . Sorting Rule:
2. System Design
3. Implementation(Java, SOLID Applied)
     . SRP : Each class does one thing(eg, sorting, reading, writing).
     . OCP : Sorting logic can be extended without modifying core.
     . DI : Passes sevices to controller. 
     . ISP & LSP : Uses Interfaces for flexibility
4. Run the Program
  javac -d out src/com/ddns/namesorter/**/*.java
  java -cp out com.ddns.namesorter.Main unsorted-names-list.txt
6. java -cp out  
