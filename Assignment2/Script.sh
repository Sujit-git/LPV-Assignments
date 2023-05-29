idlj -fall CalculatorModule.idl
javac *.java CalculatorModule/*.java
orbd -ORBInitialPort 8000
java CalculatorServer -ORBInitialPort 8000 -ORBInitialHostlocalhost 
java CalculatorClient -ORBInitialPort 8000 -ORBInitialHostlocalhost 
