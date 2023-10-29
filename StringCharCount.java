//Java Program to count the total number of characters in a string

public class StringCharCount {
    public static void main(String[] args) {
        String name = "This project delves into the realm of decentralized storage, leveraging the power of the InterPlanetary File System (IPFS), peer-to-peer (P2P) networks, and smart contracts to provide a robust and secure solution for data storage and sharing. In the past decade, technological advancements have spurred the rapid digitization of businesses, organizations, and projects, making information the most valuable asset. However, managing this ever-growing wealth of data requires a well-organized and secure system. Traditional methods, such as centralized databases, cloud storage, and data centers, have served their purpose but come with limitations, including single points of failure and potential security risks. IPFS stands out as a promising alternative. It's a decentralized, P2P architecture that ensures data is stored securely across multiple nodes, mitigating the risks associated with centralized authorities. Rather than relying on a single server or data center, IPFS distributes data across the network, making it more resistant to failures and improving data availability. IPFS works in a manner similar to BitTorrent, employing content addressing to ensure the data remains accessible. The use of smart contracts further enhances the system's transparency and security. Smart contracts are self-executing agreements with predefined rules, and they facilitate agreements between users and service providers. They outline what data is stored and the associated costs, minimizing confusion and disputes. These smart contracts are implemented through the Truffle suite. Ganache, a private wallet, monitors and tracks transactions on the network, providing users with insights into the system's activities. The project's frontend is developed using React, a JavaScript-based framework that offers a user-friendly interface for interacting with the system. The system is designed to tackle the growing data challenges of today's digital age and is prepared for the data explosion of the future";
        int count =1;
        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) ==' '){
                count += 1;
            }
        }
        System.out.println("Total number of char in that string is : "+ count);
    }
}
