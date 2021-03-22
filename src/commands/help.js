const execute = (bot, msg, args) => {
    let string = "===== COMANDOS DO BOT =====\n\n";
    bot.commands.forEach(command => {
        if (command.help) {
            string += `**${process.env.PREFIX}${command.name}**: ${command.help}\n`;
            
        }
    });
    return msg.channel.send(string);
};

module.exports = {
    name: "help",
    execute,
}