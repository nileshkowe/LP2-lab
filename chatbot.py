import nltk
from nltk.chat.util import Chat, reflections

pairs = [
    [
        r"my name is (.*)",
        ["Hello %1, How are you today ?",]
    ],
    [
        r"hi|hey|hello|hola",
        ["Hello", "Hey there",]
    ],
    [
        r"what is your name ?",
        ["I am Chatbot developed by Nilesh Kowe. you can call me Chuck",]
    ],
    [
        r"how are you ?",
        ["I'm great and hope you're having an good day too",]
    ],
    [
        r"sorry (.*)",
        ["Its alright","Its OK, never mind",]
    ],
    [
        r"I am fine",
        ["Great to hear that, How can I help you?",]
    ],
    [
        r"I (.*) good",
        ["Nice to hear that","How can I help you?:)",]
    ],
    [
        r"(.*) age?",
        ["I'm 0 years old but immortal",]
    ],
    [
        r"what (.*) want ?",
        ["Make me an offer I can't refuse",]
    ],
    [
        r"(.*) created ?",
        ["Nilesh created me using Python's NLTK library ","top G",]
    ],
    [
        r"(.*) (location|city) ?",
        ['Nagpur, Maharashtra',]
    ],
    [
        r"how is weather in (.*)?",
        ["Weather in %1 is awesome like always","Too hot man here in %1","Too cold man here in %1","Never even heard about %1"]
    ],
    [
        r"i work in (.*)?",
        ["%1 is an Amazing company, I have heard about it. But they are in huge loss these days.",]
    ],
    [
        r"(.*)raining in (.*)",
        ["No rain since last week here in %2","Damn its raining too much here in %2"]
    ],
    [
        r"how (.*) health(.*)",
        ["I'm a computer program, so I'm always healthy ",]
    ],
    [
        r"(.*) (sports|game) ?",
        ["I'm a very big fan of Soccer",]
    ],
    [
        r"who (.*) sportsperson ?",
        ["Messi","Ronaldo","Ronaldinho"]
    ],
    [
        r"who (.*) (moviestar|actor)?",
        ["Keanu Reeves"]
    ],
    [
        r"suggest me courses to learn data science",
        ["Crazy_Tech has many great articles with each step explanation along with code, you can explore"]
    ],
    [
        r"quit",
        ["Pleased to service you, Goodbye ","It was nice talking to you"]
    ],
]

def chat():
    print("Hi! I am a chatbot created by El Nix for your service")
    chat = Chat(pairs)
    chat.converse()
#initiate the conversation
if __name__ == "__main__":
    chat()
