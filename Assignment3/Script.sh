export MPJ_HOME=/home/sujit/Documents/LPVLab/Assignment3/mpj-v0_44

export PATH=$MPJ_HOME/bin:$PATH

javac -cp $MPJ_HOME/lib/mpj.jar MessagePassing.java

$MPJ_HOME/bin/mpjrun.sh -np 4 MessagePassing
