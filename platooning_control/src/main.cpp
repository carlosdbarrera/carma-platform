
#include <ros/ros.h>
#include "platoon_control.hpp"

//@SONAR_STOP@
int main(int argc, char** argv)
{
    
    ros::init(argc, argv, "platoon_control");
    platoon_control::PlatoonControlPlugin node;
    node.run();
    return 0;
};
//@SONAR_START@


