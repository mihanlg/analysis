import smtplib
from email.MIMEText import MIMEText
from email.mime.multipart import *
from email.mime.application import *

def send_email(message,
               subject,
               email_to_list,
               files_for_attachment,
               email_from,
               password,
               smtp_server):
    
    msg = MIMEMultipart()
    msg['Subject'] = subject
    msg['From'] = email_from
    msg['To'] = ', '.join(email_to_list)
    part = MIMEText(message, "plain", "utf-8")
    msg.attach(part)
    
    for filename in files_for_attachment:
        part = MIMEApplication(open(filename, 'rb').read(), "octet-stream")
        part.add_header('Content-Disposition', 'attachment; filename="' + filename.encode('utf-8') + '"')
        msg.attach(part)
    
    server = smtplib.SMTP(smtp_server)
    server.starttls()
    server.login(email_from, password)
    server.sendmail(msg['From'], email_to_list, msg.as_string())
    server.quit()
    print 'Mail was sent'

send_email('Message', 'Theme', ['getter_or_list_of_getters'], ['path_to_attachment_or_stay[]'], 'your_mail', 'your_password', 'smtp_server_of_your_mail_provider:smtp.mail.ru')